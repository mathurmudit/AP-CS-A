import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    //Create an instance of the TicTacToeGame Class here and 
	    //write the appropriate program using the methods from 
	    //the TicTacToeGame class to play a game
	    
	    TicTacToeGame game1 = new TicTacToeGame();
	    
	    while(!(game1.checkforWinner())){
	      game1.playTurn();
	      game1.printBoard();
	    }
	  }
}
