class Robot extends Player2 {

  public void playRobot(Board fun) {
    int col;
    int row;
    System.out.println("Robot's turn...");
    
    try {
      row = Math.random() * 2;
      col = Math.random() * 2;
      //check if board full
      while (funfun[row][col] == null) {
        row = Math.random() *
      
      System.out.print("Please enter the spot's row number: ");
      System.out.print("\nPlease enter the spot's collumn number: ");
      col = input.nextInt();
      fun.addToBoard(row, col, getSymbol());
      fun.displayBoard();
      fun.determineWin(getSymbol());
      }
    }
    catch(Exception e){
      //Loop if invalid input.
      System.out.println("Please input an integer number for the row and for the collumn, when prompted.");
      play2(fun);
    }
  }
}