/*
	TicTacToe.java
	last modified by j.finn: 31-Mar-2026
	Demo 2D array with simple tic-tac-toe board
 */
public class TicTacToe 
{
	public static void printBoard(char [] [] board)
	{
		System.out.println();
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

	public static void main(String args[])
	{
		// declare and initialize 3x3 board
		char [] [] board = { {'O','X','X'}, {'O','X','X'}, {'O','X','O'} };
		printBoard(board);
		
		// declare board and initialize by assigning to each element
		char [] [] board2 = new char[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
			{
				int mod = (i+j) % 3;
				if (mod == 0) board2[i][j] = 'X';
				else if (mod == 1) board2[i][j] = '0';
				else board2[i][j] = ' ';
			}
		printBoard(board2);
    }
}
