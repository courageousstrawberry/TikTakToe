import java.util.Scanner;
class Player1 {
  private Character symbol;
  Scanner input = new Scanner(System.in);

  // Constructor.
  public Player1() {
    symbol = 'o';
  }

  // Check if player one turn.
  public boolean player1Turn(int turn) {
    // Player one turn if turn count is even.
    if (turn %2 == 0) {
      return true;
    }
    return false;
  }

  // Player one plays.
  public void play1(Board fun) {
    int col;
    int row;
    
    System.out.println("Player1's turn: Where do you want to place your character?");
    try {
      System.out.print("Please enter the spot's row number: ");
      row = input.nextInt();
      System.out.print("\nPlease enter the spot's collumn number: ");
      col = input.nextInt();
      fun.addToBoard(row, col, symbol);
      fun.displayBoard();
      fun.determineWin(symbol);
    }
    // Loop if invalid input.
    catch(Exception e){
      System.out.println("Please input an integer number for the row and for the collumn, when prompted.");
      play1(fun);
    }
  }
}