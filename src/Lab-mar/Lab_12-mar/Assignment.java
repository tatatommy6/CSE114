//this program is created by me
public class Assignment{
    public static void main(String[] args) 
    {
		@SuppressWarnings("unused")
		int i, j, k, l;
		i = 5; 		// normal assignment statement
		i = (j = 3) + 7;	// assignment is an operator

		j = 3;
		i = j + 7;
		System.out.println("i = " + i + " j = " + j);
		i = (j = (k = (l = 99)));
		System.out.println("i = " + i + " j = " + j);
	}
}