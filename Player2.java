import java.util.Scanner;
class Player2 {
  private Character symbol;
  Scanner input = new Scanner(System.in);

  // Constructor.
  public Player2() {
    symbol = 'x';
  }

  // Get Player two symbol.
  public Character getSymbol() {
    return symbol;
  }
  
  // Check if player two turn.
  public boolean player2Turn(int turn) {
    // Player two's turn if the turn count is odd.
    if (turn %2 != 0) {
      return true;
    }
    return false;
  }

  // Player two plays.
  public void play2(Board fun) {
    int col;
    int row;
    System.out.println("Player2's turn: Where do you want to place your character?");
    
    try {
      System.out.print("Please enter the spot's row number: ");
      row = input.nextInt();
      System.out.print("\nPlease enter the spot's collumn number: ");
      col = input.nextInt();
      fun.addToBoard(row, col, symbol);
      fun.displayBoard();
      fun.determineWin(symbol);
    }
    catch(Exception e){
      //Loop if invalid input.
      System.out.println("Please input an integer number for the row and for the collumn, when prompted.");
      play2(fun);
    }
  }
}