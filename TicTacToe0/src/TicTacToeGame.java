import java.util.Scanner;

public class TicTacToeGame {
	
	Scanner sc = new Scanner(System.in);
	
    /** Instance Variables */
    private String[][] board;
    private String currentPlayer;
    private int numPlays;
    
    
    /** TicTacToeGame Class Constructor */
    public TicTacToeGame(){
      board = new String[3][3];
      for(int row = 0; row < board.length; row++){
        for(int col = 0; col < board[0].length; col++){
          board[row][col] = "";
        }
      }
      currentPlayer = "X";
      numPlays = 0;
    }
    
    
    /** printBoard method - Prints out the current state of the board */
    public void printBoard(){
      System.out.println("------------------");
      for(int col = 0; col < board[0].length; col++){
        System.out.print(" | " + board[0][col] + " |");
      }
      System.out.println("\n------------------");
      for(int col = 0; col < board[0].length; col++){
        System.out.print(" | " + board[1][col] + " |");
      }
      System.out.println("\n------------------");
      for(int col = 0; col < board[0].length; col++){
        System.out.print(" | " + board[2][col] + " |");
      }
      System.out.println("\n------------------");
    }
    
    
    /** checkWinner method - Checks if Player A or B has three in a row
      * column or diagonally, and displays a message accordingly
      * this method should also check if the board is full in which case
      * if there is no winner the game would result in a tie.
      */
     public boolean checkforWinner(){
       
      for (int row = 0; row < board.length; row++){
        if((board[row][0].equals(board[row][1])) && (board[row][1].equals(board[row][2])) && (!(board[row][0].equals("")))){
          if(board[row][0].equals("X"))
            System.out.println("Player A Wins, Congratulations!!!");
          else if(board[row][0].equals("O"))
            System.out.println("Player B Wins, Congratulations!!!");
          return true;
        }
      }
      
      for (int col = 0; col < board[0].length; col++){
        if((board[0][col].equals(board[1][col])) && (board[1][col].equals(board[2][col])) && (!(board[0][col].equals("")))){
          if(board[0][col].equals("X"))
            System.out.println("Player A Wins, Congratulations!!!");
          else if (board[0][col].equals("O"))
            System.out.println("Player B Wins, Congratulations!!!");
          return true;
        }
      }
      
      if((board[0][0].equals(board[1][1])) && (board[1][1].equals(board[2][2])) && (!(board[0][0].equals("")))){
        if(board[0][0].equals("X"))
          System.out.println("Player A Wins, Congratulations!!!");
        else if(board[0][0].equals("O"))
          System.out.println("Player B Wins, Congratulations!!!");
        return true;
      }
      
      if((board[0][2].equals(board[1][1])) && (board[1][1].equals(board[2][0])) && (!(board[0][2].equals("")))){
        if(board[0][2].equals("X"))
          System.out.println("Player A Wins, Congratulations!!!");
        else if(board[0][2].equals("O"))
          System.out.println("Player B Wins, Congratulations!!!");
        return true;
      }
      
      int blankCount = 0;
      for(int row = 0; row < board.length; row++){
        for(int col = 0; col < board[0].length; col++){
          if(board[row][col].equals(""))
            blankCount++;
        }
      }
      if(blankCount == 0){
        System.out.println("The game is a tie! Shucks!");
        return true;
      }
      return false;
     }
     
     
    /** playTurn method - Promts the user to enter their location for their
     * next turn and updates the board accordingly.  This method should check
     * the validity of a players entry.
     */
     public void playTurn(){
       if(numPlays%2 == 0)
        System.out.println("Player A, Choose your move!");
       else 
        System.out.println("Player B, Choose your move!");
        
       System.out.println("row:");
       int row = sc.nextInt();
       System.out.println("col:");
       int col = sc.nextInt();
       
       while (!((row < board.length) && (col < board[0].length) && (board[row][col].equals("")))){
         System.out.println("Invalid Move - try again!");
         System.out.println("row:");
         row = sc.nextInt();
         System.out.println("col:");
         col = sc.nextInt();
       }
       
       board[row][col] = currentPlayer;
       numPlays++;
       if(numPlays%2 == 0)
        currentPlayer = "X";
       else 
        currentPlayer = "O";
       
     }
}
