package a3;

import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * board class
 * by Qianhe Xie
 *
 */

public class board implements global{

	public block[][] blocks;
	
	
	private int state;
	
	
	/**
	 * defualt constructor
	 * populate a game board with empty blocks
	 */
	
	public board() {
		
		blocks = new block[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j =0; j<3;j++) {
				
				blocks[i][j] = new block();
			}
	
		}
	
		//state = 1;
		
	}
	
	
	/**
	 * check row method
	 * input: row number
	 * check the row given if there is a combination
	 */
	
	public int checkRow(int row) {
		
		if(blocks[row][0].getState() == global.O && blocks[row][1].getState() == global.O && blocks[row][2].getState() == global.O) {
			
			return 1;
			
		}else if(blocks[row][0].getState() == global.X && blocks[row][1].getState() == global.X && blocks[row][2].getState() == global.X) {
			
			return 2;
			
		}
		
		return 0;
		
	}
	
	
	/**
	 * check col method
	 * input: col number
	 * check the col given if there is a combination
	 */
	
	public int checkCol(int col) {
		
		if(blocks[0][col].getState() == global.O && blocks[1][col].getState() == global.O && blocks[2][col].getState() == global.O) {
			
			return 1;
			
		}else if(blocks[0][col].getState() == global.X && blocks[1][col].getState() == global.X && blocks[2][col].getState() == global.X) {
			
			return 2;
			
		}
		
		return 0;
		
		
	}
	
	/**
	 * check diagonals method
	 * check for both diagonals if there is a combination
	 */
	
	public int checkDiagonals() {
		
		if(blocks[0][0].getState() == global.O && blocks[1][1].getState() == global.O && blocks[2][2].getState() == global.O) {
			
			return 1;
			
		}else if(blocks[0][2].getState() == global.O && blocks[1][1].getState() == global.O && blocks[2][0].getState() == global.O){
			
			return 1;
			
		} else if(blocks[0][0].getState() == global.X && blocks[1][1].getState() == global.X && blocks[2][2].getState() == global.X) {
			
			return 2;
			
		}else if(blocks[0][2].getState() == global.X && blocks[1][1].getState() == global.X && blocks[2][0].getState() == global.X) {
			
			
			return 2;
		}
		
		
		return 0;
	}
	
	/**
	 * check draw method
	 * return 1 if the draw condition is met
	 */
	
	public int checkDraw() {
		
		for(int row =0;row <3;row ++) {
			for(int col =0 ;col <3;col++) {
				
				if(blocks[row][col].getState() == global.EMPTY) {
					
					return 0;
				}
				
			}
			
		}
		
		
		return 1;
		
		
	}
	
	
	/**
	 * display board method
	 * display the game board
	 */
	
	public void displayBoard() {
		
		
	
		System.out.println("|---|---|---|");
		
		for (int i = 0; i < 3; i++) {    
			
			System.out.print("| ");
				
			for (int j = 0; j < 3; j++) {
				
				System.out.print(blocks[i][j]+" | ");
				
				  }
			
			System.out.println("\n|---|---|---|");
		}
}
	
	
	
	/**
	 * display selection board method
	 * display the selection board
	 */
	
	public void displayPlyerSelectionBoard() {

		char sel[][] = new char[][] {
									{'1','2','3'},
									{'4','5','6'},
									{'7','8','9'}
		};
		
		System.out.println("|---|---|---|");
		
		for(int i =0;i < 3;i ++) {
			
			System.out.print("| ");
			
			for(int j = 0;j <3;j ++) {
				
				System.out.print(sel[i][j]+" | ");
				
			}
			
			
			System.out.println("\n|---|---|---|");
			
		}
		
		
		
	}
	
	/**
	 * make move method
	 * input: the game board, row, col and the current symbol
	 * output:make the move at the given cordinate, if failed, return 0, otherwise 1
	 */
	
	public boolean makeMove(board gameBoard, int row,int col,int playerSymbol) {
		
		
			
			if(gameBoard.blocks[row][col].getState() == global.EMPTY) {
				
				gameBoard.blocks[row][col].setState(playerSymbol);
				
				return true;
				
			}else
				
				System.out.println("Block ocupied !!!");
				
			return false;
			
		}
		
		
		

	/**
	 * update state method
	 * output:update the state of the game each time called to check if any of the game ending contion is met
	 */
	
	public int updateState() {
		
		if(checkCol(0) == 1 || checkCol(1) == 1 || checkCol(2) == 1 || checkRow(0) == 1 || checkRow(1) == 1 || checkRow(2) == 1) {
			
			
			return global.Owin;
			
		}else if(checkCol(0) == 2 || checkCol(1) == 2 || checkCol(2) == 2 || checkRow(0) == 1 || checkRow(1) == 1 || checkRow(2) == 1) {
			
			return global.Xwin;
			
		}else if(checkDiagonals()==1) {
			
			
			return global.Owin;
			
		}else if(checkDiagonals() == 2) {
			
			return global.Xwin;
			
		}else if(checkDraw() == 1) {
			
			return global.DRAW;
			
			
		}
		
		
		return 0;
		
	}
	
}
