// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) 
	{
		int num = Integer.parseInt(args[0]);
		int hun, tens, one;
		hun = num / 100;
		tens = (num - (hun*100))/ 10;
		one = num - (hun*100) - (tens*10);
		System.out.println(hun + " hundreds, " + tens + " tens, and " + one + " ones.");

	    // Replace this comment with your code
	}
}
