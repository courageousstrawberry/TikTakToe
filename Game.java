class Game extends Board {
  Player1 one;
  Player2 two;
  Board game;
  int countTurn;

  // Constructor.
  public Game() {
    one = new Player1();
    two = new Player2();
    game = new Board();
    countTurn = 0;
  }

  // Welcome message.
  public void welcome() {
    System.out.println("Welcome to TicTacToe. The game functions like a regular TicTacToe game. In this game the board will be organized by rows and collumns. If a spot on the board is empty, it will contain the number of the row and the collumn of the spot that it is located.");
    game.displayBoard();
  }

  // User prompt.
  public void promptUser(){
    // Loop until someone wins.
    while (true) {
      // Exit loop if player 2 wins.
      if(game.determineWin('x')) {
        System.out.println("Player 2 won!");
        break;
      }
      // Exit loop if player 1 wins.
      if (game.determineWin('o')) {
        System.out.println("Player 1 won!");
        break;
      }
      // Check if it's player one's turn.
      if (one.player1Turn(countTurn)) {
        // Player one plays.
        one.play1(game);
        // Increment number of turns.
        countTurn++;
      }
      // Check if it's player two's turn.
      else if (two.player2Turn(countTurn)){
        // Player two plays.
        two.play2(game);
        // Increment number of turns.
        countTurn++;
      }
    }
    System.out.println("Game over.");
  }
}