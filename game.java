package a3;

import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * game class
 * by Qianhe Xie
 *
 */

public class game implements global{
	
	public boolean done;
	
	private board gameBoard;
	
	private player playerO;
	
	private player playerX;
	
	public static int turn =0;
	
	
	public game() {
		
		gameBoard = new board();
		
		done = false;
		
		
	}
	
	
	/**
	 * start method
	 * input: different numbers for pvp and pvAi
	 *play the game
	 */
	
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("XXOXX   Welcome to Tic Tac Toe!!!   XXOXX\n\n1.Player vs Player.\n\n2.AI vs Player.");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {  //Player VS Player
			
			System.out.println("Player vs Player started.\n");
			
			//decide marks

				System.out.println("\nPlayerO name:");
			
				String nameO = sc.next();
			
				playerO = new HumanPlayer(gameBoard, nameO, global.O);	
				
				System.out.println("\nPlayerX name:");
				
				String nameX = sc.next();
				
				playerX = new HumanPlayer(gameBoard, nameX, global.X);	
			
			
			//Game Start
				
				int coin = (int) (Math.random() * 2);
		
				if(coin == 0) {
					
					System.out.println("Tossing coin......\n\n"+nameO + "(O) moves first.");	
					
					//gameBoard.displayPlyerSelectionBoard();
					
						do {
						
							playerO.play(gameBoard);
							
							turn++;
						
						if(gameBoard.updateState() == global.Owin) {
							
							System.out.println(nameO + "(O) is the winner!!!");
							
							done = true;
							
							break;
							
						}else if(gameBoard.updateState() == global.Xwin) {
							
							System.out.println(nameX + "(X) is the winner!!!");
							
							done = true;
							
							break;
							
						}else if(turn == global.DRAW) {
							
							System.out.println("It's a Draw!!!");
							
							done = true;
							
							break;
							
						}
						
						
							playerX.play(gameBoard);
						
							turn++;
						
							if(gameBoard.updateState() == global.Owin) {
								
								
							System.out.println(nameO + "(O) is the winner!!!");
							
							done = true;
							
							break;
							
						}else if(gameBoard.updateState() == global.Xwin) {
							
							System.out.println(nameX + "(X) is the winner!!!");
							
							done = true;
							
							break;
							
							
						}else if(turn == global.DRAW) {
							
							System.out.println("It's a Draw!!!");
							
							done = true;
							
							break;
							
						}
				
						
					
					}while(!done);
					
				}else{
					
					System.out.println("Tossing coin......\n\n"+nameX + "(X) moves first.");	
					
					
					
					
						do {
						
						playerX.play(gameBoard);	
						
						turn++;
						
						if(gameBoard.updateState() == global.Owin) {
							
							System.out.println(nameO + "(O) is the winner!!!");
							
							done = true;
							
							break;
							
						}else if(gameBoard.updateState() == global.Xwin) {
							
							System.out.println(nameX + "(X) is the winner!!!");
							
							done = true;
							
							break;
							
						}else if(turn == global.DRAW) {
							
							System.out.println("It's a Draw!!!");
							
							done = true;
							
							break;
							
						}
							
						//2nd player moves
						
						playerO.play(gameBoard);
						
						turn++;
						
						if(gameBoard.updateState() == global.Owin) {
							
							System.out.println(nameO + "(O) is the winner!!!");
							
							done = true;
							
							break;
							
						}else if(gameBoard.updateState() == global.Xwin) {
							
							System.out.println(nameX + "(X) is the winner!!!");
							
							done = true;
							
							break;
							
						}else if(turn == global.DRAW) {
							
							System.out.println("It's a Draw!!!");
							
							done = true;
							
							break;
							
						}
						
						
					
					}while(!done);
					
					
				}
				
			
			
		}else if(choice == 2) {   //Player VS AI
			
			
			//game start
			
			
			System.out.println("AI vs Player started.\n");
			
			System.out.println("\nPlayer name:");
			
			String nameO = sc.next();
		
			playerO = new HumanPlayer(gameBoard, nameO, global.O);	
			
			System.out.println("\nBot joined...\n");
			
			
			
			playerX = new AIPlayer(gameBoard, "Bot", global.X);	
			
			
			//coin toss
			
			int coin = (int) (Math.random() * 2);
			
			if(coin == 0) {
				
				System.out.println("Tossing coin......\n\n"+nameO + "(O) moves first.");	
				
				
				do {
					
					
					playerO.play(gameBoard);
					
					turn++;
				
				if(gameBoard.updateState() == global.Owin) {
					
					System.out.println(nameO + "(O) is the winner!!!");
					
					done = true;
					
					break;
					
				}else if(gameBoard.updateState() == global.Xwin) {
					
					System.out.println("Bot(X) is the winner!!!");
					
					done = true;
					
					break;
					
				}else if(gameBoard.updateState() == global.DRAW) {
					
					System.out.println("It's a Draw!!!");
					
					done = true;
					
					break;
					
				}
				
				
					playerX.play(gameBoard);
					
					turn++;
				
				
					if(gameBoard.updateState() == global.Owin) {
						
						
					System.out.println(nameO + "(O) is the winner!!!");
					
					done = true;
					
					break;
					
				}else if(gameBoard.updateState() == global.Xwin) {
					
					System.out.println("Bot(X) is the winner!!!");
					
					done = true;
					
					break;
					
					
				}else if(gameBoard.updateState() == global.DRAW) {
					
					System.out.println("It's a Draw!!!");
					
					done = true;
					
					break;
					
				}
		
				
			
			}while(!done);
				
				
				
				
			}else if(coin == 1) {
				
				System.out.println("Tossing coin......\n\nBot(X) moves first.");
				
				
					do {
					
					playerX.play(gameBoard);	
					
					turn++;
					
					if(gameBoard.updateState() == global.Owin) {
						
						System.out.println(nameO + "(O) is the winner!!!");
						
						done = true;
						
						break;
						
					}else if(gameBoard.updateState() == global.Xwin) {
						
						System.out.println("Bot(X) is the winner!!!");
						
						done = true;
						
						break;
						
					}else if(turn == global.DRAW) {
						
						System.out.println("It's Draw!!!");
						
						done =true;
						
						break;
						
					}
					
					//2nd player moves
						
					playerO.play(gameBoard);
					
					turn++;
					
					if(gameBoard.updateState() == global.Owin) {
						
						System.out.println(nameO + "(O) is the winner!!!");
						
						done = true;
						
						break;
						
					}else if(gameBoard.updateState() == global.Xwin) {
						
						System.out.println("Bot(X) is the winner!!!");
						
						done = true;
						
						break;
						
					}else if(turn ==global.DRAW) {
						
						System.out.println("It's Draw!!!");
						
						done =true;
						
						break;
						
					}
					
					
				
				}while(!done);
			
				
			}
			
			
			
		}else {
			
			System.out.println("Enter a valid option.");
			
			
			
		}
			
		System.out.println("GG!!");
		
	}
	
	
	
}
