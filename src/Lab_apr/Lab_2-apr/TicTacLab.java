/*
	TicTacLab.java
	last modified by j.finn: 1-Apr
	Demo 2D array with simple tic-tac-toe game
 */
import java.util.Scanner;

public class TicTacLab 
{
	// print tictactoe board
	public static void printBoard(char [] [] board)
	{
		System.out.println("Current board:");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(board[i][j]);
				if (j < 2) System.out.print('|');
				else System.out.println();
			}
			if (i < 2) System.out.println("–––––");
		}
		System.out.println();
	}
	
	// show the input codes for each board square
	public static void printCodes()
	{
		System.out.println("These are the codes for the board positions");
		System.out.println("1|2|3");
		System.out.println("–––––");
		System.out.println("4|5|6");
		System.out.println("–––––");
		System.out.println("7|8|9\n");
	}

	/*
		c is 'X' or 'O'
		Return true if board is a winning position for c
		Lab exercise: write this function.
	 */
	public static boolean checkWin(char [] [] board, char c)
	{
		return false;
	}

	/* 
		play tic tac toe.
		lab exercise. main crashes if user input is not a number between 1 and 9
		fix this.
	 */
	public static void main(String args[])
	{
		
		// declare and initialize 3x3 board
		char [] [] board = { {' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '} };
		@SuppressWarnings("resource")
		Scanner scan  = new Scanner(System.in);
		char player = 'X';		// X goes first
		int row, col, move;
		int count = 0;			// how many moves have been made

		System.out.println("Let's play Tic Tac Toe. Players ready?");
		printCodes();
		while (count < 9)
		{
			System.out.print("Enter move for " + player + ": ");
			move = scan.nextInt(); 	// get number 1..9
			row = (move-1) / 3;		// convert to row, col
			col = (move+2) % 3;
			if (board[row][col] == ' ')		// legit move, space is empty
			{
				board[row][col] = player;
				printBoard(board);
				if (checkWin(board, player))	// did player just win the game?
				{
					System.out.println("Congratulations, " + player + ", you win!");
					return;
				}					
				if (player == 'X') player = 'O';
				else player = 'X';
				count++;
			}
			else
				System.out.println("Try again, that square is occupied");			
		}
		System.out.println("Tie game");
		scan.close();
    }
}
