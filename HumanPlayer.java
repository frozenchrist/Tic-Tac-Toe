package a3;

import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * Human player class
 * by Qianhe Xie
 *
 */

public class HumanPlayer extends player implements global{
	
	/**
	 * overloaded constructor
	 *create a human player
	 */

	public HumanPlayer(board gameBoard, String playerName,int playerSymbol ) {
		
		super(gameBoard,playerName,playerSymbol);
		
		
		
		
	}
	
	/**
	 * play method
	 * input: a borad object
	 * output: input the block number from player selection board to make a move
	 */
	
	public void play(board gameBoard) {
		
		gameBoard.displayPlyerSelectionBoard();
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Make your move: ");
			
		int move = sc.nextInt();
			
		switch(move) {
		
		
					case 1:
							while(gameBoard.makeMove(gameBoard,0,0,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
						
							
							break;
												
							}
							
							
										
							if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
											
							gameBoard.displayBoard();
										
							break;
										
								
								}
												
									gameBoard.displayBoard();
									
									if(playerSymbol == global.O) {
										
										System.out.println("\nPlayerX's turn.");
										
									}else {
										
										System.out.println("\nPlayerO's turn.");
										
										
									}
									
									
							
								break;
						
					
					
					case 2:
						
							while(gameBoard.makeMove(gameBoard,0,1,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
						
							
							break;
												
							}
							
							
								
								if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin) {
									
									gameBoard.displayBoard();
								
								break;
								
							}
								
									
									
								gameBoard.displayBoard();
									
								if(playerSymbol == global.O) {
										
										System.out.println("\nPlayerX's turn.");
										
								}else {
										
										System.out.println("\nPlayerO's turn.");
										
										
								}
							
								
								
								break;
								
						
						
						
					case 3:
						
							while(gameBoard.makeMove(gameBoard,0,2,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
						
							
							break;
												
							}
							
							
								
								if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
									
									gameBoard.displayBoard();
								
								break;
								
							}
							
								
								gameBoard.displayBoard();
								
								if(playerSymbol == global.O) {
									
									System.out.println("\nPlayerX's turn.");
									
								}else {
									
									System.out.println("\nPlayerO's turn.");
									
									
								}
						
								
								break;
								
								
							
							
						
					case 4:
						
						
							while(gameBoard.makeMove(gameBoard,1, 0,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
							move = sc.nextInt();
												
							}
							
							
							if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
								
								gameBoard.displayBoard();
							
							break;
							
						}
							
						
							
							
							gameBoard.displayBoard();
							
							if(playerSymbol == global.O) {
								
								System.out.println("\nPlayerX's turn.");
								
							}else {
								
								System.out.println("\nPlayerO's turn.");
								
								
							}
					
							
					
							break;
						
					case 5:
						
						
							
							while(gameBoard.makeMove(gameBoard,1,1,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
							
												
							}
							
							
							if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
								
								gameBoard.displayBoard();
							
							break;
							
						}
						
							
							
							gameBoard.displayBoard();
							
							if(playerSymbol == global.O) {
								
								System.out.println("\nPlayerX's turn.");
								
							}else {
								
								System.out.println("\nPlayerO's turn.");
								
								
							}
					
							
					
							break;
						
					case 6:
						
						
						
							while(gameBoard.makeMove(gameBoard,1, 2,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
							move = sc.nextInt();
												
							}
							
							if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
								
								gameBoard.displayBoard();
							
							break;
							
						}
							
							
							gameBoard.displayBoard();
							
							if(playerSymbol == global.O) {
								
								System.out.println("\nPlayerX's turn.");
								
							}else {
								
								System.out.println("\nPlayerO's turn.");
								
								
							}
					
							
							
							break;
						
					case 7:
						
						
						
							while(gameBoard.makeMove(gameBoard,2, 0,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
							move = sc.nextInt();
												
							}
							
							
							if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
								
								gameBoard.displayBoard();
							
							break;
							
						}
						
							
							
							gameBoard.displayBoard();
							
							if(playerSymbol == global.O) {
								
								System.out.println("\nPlayerX's turn.");
								
							}else {
								
								System.out.println("\nPlayerO's turn.");
								
								
							}
					
							
							
							break;
						
					case 8:
						
						
						
							while(gameBoard.makeMove(gameBoard,2, 1,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
							move = sc.nextInt();
												
							}
							
							if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
								
								gameBoard.displayBoard();
							
							break;
							
						}
							
						
							
							
							gameBoard.displayBoard();
							
							if(playerSymbol == global.O) {
								
								System.out.println("\nPlayerX's turn.");
								
							}else {
								
								System.out.println("\nPlayerO's turn.");
								
								
							}
					
							
							
							break;
						
					case 9:
						
						
							
							while(gameBoard.makeMove(gameBoard,2, 2,playerSymbol) == false) {
							
							
							System.out.println("\nInvalid move, play again:");
							
							move = sc.nextInt();
												
							}
							
							
							if(gameBoard.updateState() == global.Owin || gameBoard.updateState() == global.Xwin || gameBoard.updateState() == global.DRAW) {
								
								gameBoard.displayBoard();
							
							break;
							
						}
						
							
							
							gameBoard.displayBoard();
							
							if(playerSymbol == global.O) {
								
								System.out.println("\nPlayerX's turn.");
								
							}else {
								
								System.out.println("\nPlayerO's turn.");
								
								
							}
							
							
							break;

		
			}
		
		
		
	}
	
}
