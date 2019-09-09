package a3;

import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * Ai plyer class
 * by Qianhe Xie
 */

public class AIPlayer extends player implements global{

	/**
	 * overloaded constructor to create a ai player
	 * 
	 */
	
	public AIPlayer(board gameBoard, String playerName,int playerSymbol ) {
		
		super(gameBoard , playerName, playerSymbol);
		
	
	}
	
	
	/**
	 * play method
	 * input: gameBorad object
	 * make moves based on different situations
	 */
	
	public void play(board gameBoard) {
		
		if(senseWin(gameBoard) == 1) {
			
			gameBoard.updateState();
			
			System.out.println("Bot: I see a winning move!!!\n");
			
			
		}else if(senseLoss(gameBoard) == 1) {
			
			System.out.println("Bot: can't let you win, have to defend!!\n");
			
			
		} else if(randomLegal(gameBoard) == 1) {
			
			gameBoard.updateState();
			
		}
		
		
		gameBoard.displayBoard();
		
		System.out.println("I've made my move.");
		
		if(playerSymbol == global.O) {
			
			System.out.println("\nPlayerX's turn.");
			
		}else {
			
			System.out.println("\nPlayerO's turn.");
			
			
		}
		
		
		
		
	}
	
	
	/**
	 * random move method
	 * input: board object
	 * output: generated random row and col and make that move if legal 
	 */
	
	public int randomLegal(board gameBoard) {
	

			int randRow = (int) (Math.random() *3);
			
			int randrCol = (int) (Math.random() *3);
			
			
			if(gameBoard.blocks[randRow][randrCol].getState() == global.EMPTY) {
				
				gameBoard.makeMove(gameBoard, randRow,randrCol,playerSymbol);
			
				return 1;
			
			}
			
			
			while(gameBoard.blocks[randRow][randrCol].getState() != global.EMPTY) {
				
				randRow = (int) (Math.random() *3);
				
				randrCol = (int) (Math.random() *3);
				
					if(gameBoard.blocks[randRow][randrCol].getState() == global.EMPTY) {
				
						gameBoard.makeMove(gameBoard, randRow,randrCol,playerSymbol);
					
						return 1;
					
					}
					
					
			}


	
		return 0;
		
		
	}
	
	/**
	 * sense loss method
	 * input: board
	 * return 1 if any of the losing condition met
	 */
	
	public int senseLoss(board gameBoard) {
		
		//Check first row
		if(gameBoard.blocks[0][0].getState() == global.EMPTY && (gameBoard.blocks[0][1].getState() == global.O && gameBoard.blocks[0][2].getState() == global.O)) {
		
			gameBoard.makeMove(gameBoard, 0,0,playerSymbol);
				
			return 1;
			
		}else if(gameBoard.blocks[0][1].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.O && gameBoard.blocks[0][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 0,1,playerSymbol);
			
			return 1;
			
			
		}else if(gameBoard.blocks[0][2].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.O && gameBoard.blocks[0][1].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 0,2,playerSymbol);
			
			return 1;
			
			
			//Check 2nd row
		}else if(gameBoard.blocks[1][0].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.O && gameBoard.blocks[1][2].getState() == global.O)) {    
			
			gameBoard.makeMove(gameBoard, 1,0,playerSymbol);
			
			return 1;
			
			
		}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[1][0].getState() == global.O && gameBoard.blocks[1][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
			
			return 1;	
			
			
		}else if(gameBoard.blocks[1][2].getState() == global.EMPTY && (gameBoard.blocks[1][0].getState() == global.O && gameBoard.blocks[1][1].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 1,2,playerSymbol);
			
			return 1;
			
			
			//Check 3rd row	
		}else if(gameBoard.blocks[2][0].getState() == global.EMPTY && (gameBoard.blocks[2][1].getState() == global.O && gameBoard.blocks[2][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 2,0,playerSymbol);
			
			return 1;
			
			
		}
		else if(gameBoard.blocks[2][1].getState() == global.EMPTY && (gameBoard.blocks[2][0].getState() == global.O && gameBoard.blocks[2][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 2,1,playerSymbol);
			
			return 1;
			
			
		}else if(gameBoard.blocks[2][2].getState() == global.EMPTY && (gameBoard.blocks[2][0].getState() == global.O && gameBoard.blocks[2][1].getState() == global.O)) {
			
			
			gameBoard.makeMove(gameBoard, 2,2,playerSymbol);
			
			return 1;
			
		//first col	
		}else if(gameBoard.blocks[0][0].getState() == global.EMPTY && (gameBoard.blocks[1][0].getState() == global.O && gameBoard.blocks[2][0].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 0,0,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[1][0].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.O && gameBoard.blocks[2][0].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 1,0,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[2][0].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.O && gameBoard.blocks[1][0].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 2,0,playerSymbol);
			
			return 1;
			
		//2nd col	
		}else if(gameBoard.blocks[0][1].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.O && gameBoard.blocks[2][1].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 0,1,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[0][1].getState() == global.O && gameBoard.blocks[2][1].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[2][1].getState() == global.EMPTY && (gameBoard.blocks[0][1].getState() == global.O && gameBoard.blocks[1][1].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 2,1,playerSymbol);
			
			return 1;
			
		//3rd col	
		}else if(gameBoard.blocks[0][2].getState() == global.EMPTY && (gameBoard.blocks[1][2].getState() == global.O && gameBoard.blocks[2][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 0,2,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[1][2].getState() == global.EMPTY && (gameBoard.blocks[0][2].getState() == global.O && gameBoard.blocks[2][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 1,2,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[2][2].getState() == global.EMPTY && (gameBoard.blocks[0][2].getState() == global.O && gameBoard.blocks[1][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 2,2,playerSymbol);
			
			return 1;
		
		//Diagonals	
		}else if(gameBoard.blocks[0][0].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.O && gameBoard.blocks[2][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 0,0,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.O && gameBoard.blocks[2][2].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[2][2].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.O && gameBoard.blocks[1][1].getState() == global.O)) {
			
			gameBoard.makeMove(gameBoard, 2,2,playerSymbol);
			
			return 1;
			
		//back Diagnals	
		}else if(gameBoard.blocks[0][2].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.O && gameBoard.blocks[2][0].getState() == global.O)) {
			
gameBoard.makeMove(gameBoard, 0,2,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[0][2].getState() == global.O && gameBoard.blocks[2][0].getState() == global.O)) {
			
gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
			
			return 1;
			
		}else if(gameBoard.blocks[2][0].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.O && gameBoard.blocks[0][2].getState() == global.O)) {
			
gameBoard.makeMove(gameBoard, 2,0,playerSymbol);
			
			return 1;
			
		}
		
		return 0;
		
		
	}
	
	
	/**
	 * sense win method
	 * input: board
	 * return 1 if any of the wining condition met
	 */
	
	public int senseWin(board gameBoard) {
		
		
		//Check first row
				if(gameBoard.blocks[0][0].getState() == global.EMPTY && (gameBoard.blocks[0][1].getState() == global.X && gameBoard.blocks[0][2].getState() == global.X)) {
				
					gameBoard.makeMove(gameBoard, 0,0,playerSymbol);
						
					return 1;
					
				}else if(gameBoard.blocks[0][1].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.X && gameBoard.blocks[0][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 0,1,playerSymbol);
					
					return 1;
					
					
				}else if(gameBoard.blocks[0][2].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.X && gameBoard.blocks[0][1].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 0,2,playerSymbol);
					
					return 1;
					
					
					//Check 2nd row
				}else if(gameBoard.blocks[1][0].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.X && gameBoard.blocks[1][2].getState() == global.X)) {    
					
					gameBoard.makeMove(gameBoard, 1,0,playerSymbol);
					
					return 1;
					
					
				}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[1][0].getState() == global.X && gameBoard.blocks[1][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
					
					return 1;	
					
					
				}else if(gameBoard.blocks[1][2].getState() == global.EMPTY && (gameBoard.blocks[1][0].getState() == global.X && gameBoard.blocks[1][1].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 1,2,playerSymbol);
					
					return 1;
					
					
					//Check 3rd row	
				}else if(gameBoard.blocks[2][0].getState() == global.EMPTY && (gameBoard.blocks[2][1].getState() == global.X && gameBoard.blocks[2][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 2,0,playerSymbol);
					
					return 1;
					
					
				}
				else if(gameBoard.blocks[2][1].getState() == global.EMPTY && (gameBoard.blocks[2][0].getState() == global.X && gameBoard.blocks[2][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 2,1,playerSymbol);
					
					return 1;
					
					
				}else if(gameBoard.blocks[2][2].getState() == global.EMPTY && (gameBoard.blocks[2][0].getState() == global.X && gameBoard.blocks[2][1].getState() == global.X)) {
					
					
					gameBoard.makeMove(gameBoard, 2,2,playerSymbol);
					
					return 1;
					
				//first col	
				}else if(gameBoard.blocks[0][0].getState() == global.EMPTY && (gameBoard.blocks[1][0].getState() == global.X && gameBoard.blocks[2][0].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 0,0,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[1][0].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.X && gameBoard.blocks[2][0].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 1,0,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[2][0].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.X && gameBoard.blocks[1][0].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 2,0,playerSymbol);
					
					return 1;
					
				//2nd col	
				}else if(gameBoard.blocks[0][1].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.X && gameBoard.blocks[2][1].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 0,1,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[0][1].getState() == global.X && gameBoard.blocks[2][1].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[2][1].getState() == global.EMPTY && (gameBoard.blocks[0][1].getState() == global.X && gameBoard.blocks[1][1].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 2,1,playerSymbol);
					
					return 1;
					
				//3rd col	
				}else if(gameBoard.blocks[0][2].getState() == global.EMPTY && (gameBoard.blocks[1][2].getState() == global.X && gameBoard.blocks[2][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 0,2,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[1][2].getState() == global.EMPTY && (gameBoard.blocks[0][2].getState() == global.X && gameBoard.blocks[2][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 1,2,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[2][2].getState() == global.EMPTY && (gameBoard.blocks[0][2].getState() == global.X && gameBoard.blocks[1][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 2,2,playerSymbol);
					
					return 1;
				
				//Diagonals	
				}else if(gameBoard.blocks[0][0].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.X && gameBoard.blocks[2][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 0,0,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.X && gameBoard.blocks[2][2].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[2][2].getState() == global.EMPTY && (gameBoard.blocks[0][0].getState() == global.X && gameBoard.blocks[1][1].getState() == global.X)) {
					
					gameBoard.makeMove(gameBoard, 2,2,playerSymbol);
					
					return 1;
					
				//back Diagnals	
				}else if(gameBoard.blocks[0][2].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.X && gameBoard.blocks[2][0].getState() == global.X)) {
					
		gameBoard.makeMove(gameBoard, 0,2,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[1][1].getState() == global.EMPTY && (gameBoard.blocks[0][2].getState() == global.X && gameBoard.blocks[2][0].getState() == global.X)) {
					
		gameBoard.makeMove(gameBoard, 1,1,playerSymbol);
					
					return 1;
					
				}else if(gameBoard.blocks[2][0].getState() == global.EMPTY && (gameBoard.blocks[1][1].getState() == global.X && gameBoard.blocks[0][2].getState() == global.X)) {
					
		gameBoard.makeMove(gameBoard, 2,0,playerSymbol);
					
					return 1;
					
				}
		
		
		return 0;
		
	}
	
	
	
	
	
	
}
