class Board {
  private Character board[][];

  // Constructor
  public Board(){
    board = new Character[3][3];
  }

  // Display Board method
  public void displayBoard() {
    System.out.println("___________________");
    for (int row = 0; row < board.length; row++){
      for (int col = 0; col < board[0].length; col++){
        // If spot is empty, display the row and collumn numbers.
        if (board[row][col] == null) {
          System.out.print("| " + row + "," + col + " ");
        }
        // If spot is taken, display character.
        else {
          System.out.print("|  " + board[row][col] + "  ");
        }
      }
      System.out.println("" + "|");
      System.out.println("___________________");
    }
  }

  // Check if board is full -- NEED TO FIX
  public boolean fullBoard() {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[0].length; col++) {
        
      }
    }
  }
  // Add a character to a specific row and collumn on the board.
  public void addToBoard(int r, int c, Character chara)   {
    if (board[r][c] == null) {
      board[r][c] = chara;
    }
    else {
      System.out.println("This spot is full, pick a different one.");
      displayBoard();
    }
  }

  // Determine a win based on the character.
  public boolean determineWin(Character w) {
    boolean win = false;
    
    // Horizontal win.
    for (int row = 0; row < 3; row++) {
       if (board[row][0] == w && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
         win = true;
       }
    }
    
    // Vertical win.
    for (int i = 0; i < 3; ++i) {
      if (board[0][i] == w && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
        win = true;
      }
    }

    // Diagonal, left to right win.
    if (board[0][0] == w && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
      win = true;
    }
    
    // Diagonal, right to left win.
    if (board[0][2] == w && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
      win = true;
    }
    
  return win;
  }
}