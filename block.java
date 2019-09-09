package a3;

import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * block class
 * by Qianhe Xie
 */

public class block implements global{

	private int state;
	
	public block(){
		
	state = global.EMPTY;
		
	}
	
	/**
	 * getters and setters for State
	 * method used to get or set attribute state
	 */
	
	public void setState(int state) {
		
		if(isValid(state)) {
			
			this.state = state;
			
		}
			
	}
	
	/**
	 * getters and setters for State
	 * method used to get or set attribute state
	 */
	
	public int getState() {
		
		return state;
		
	}
	
	/**
	 * is valid method
	 * check if state is valid to set
	 * 
	 */
	
	public boolean isValid(int state) {
		
		if(this.state == global.EMPTY ) {
			
			return true;
		}
		
		return false;
		
		
	}
	
	/**
	 * to string method
	 * used to print out each block
	 */
	
	public String toString() {
		
		if(state == global.O) {
			
			return "O";
			
		}else if(state == global.X) {
			
			return "X";
			
		}else {
			
			return " ";
		}
		
		 
	}
	
	
	
}
