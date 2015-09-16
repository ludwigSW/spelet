public class Plan{
	private int[] board;

	public Plan(){
		board = new int[9];

	}

		private String getMark(int status)
	{
		if (status == 3)
		    return "X";
		if (status == 5)
		    return "O";
		return " ";
	}


	public String toString(){
		return " " +
		       getMark(board[0]) + " | " +
		       getMark(board[1]) + " | " +
		       getMark(board[2]) +
		       "\n-----------\n" +
		       " " +
		       getMark(board[3]) + " | " +
		       getMark(board[4]) + " | " +
		       getMark(board[5]) +
		       "\n-----------\n" +
		       " " +
		       getMark(board[6]) + " | " +
		       getMark(board[7]) + " | " +
		       getMark(board[8]);

	}

}

