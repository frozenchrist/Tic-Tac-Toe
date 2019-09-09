package a3;

import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * player abstract class
 * by qianhe xie
 *
 */

public abstract class player implements global{
	
	private board gameBoard;
	
	private String playerName;
	
	public int playerSymbol;
	
	/**
	 * overloaded constructor
	 * create a player object
	 */
	
	public player(board gameBoard, String playerName,int playerSymbol ) {
		
		this.gameBoard = gameBoard;
		
		this.playerName = playerName;
		
		this.playerSymbol = playerSymbol;
	}
	
	/**
	 * play abstract method
	 */
	
	public abstract void play(board gameBoard);
	
	
	
	
	
	
	

}
