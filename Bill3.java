// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args)
	{
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double total = Double.parseDouble(args[3]); 
		double divide = total/3.0 ;
		double amount = Math.ceil(divide);
		int amount1= (int) amount;
		System.out.println("dear " + name1 + ", " +name2 + " and " + name3 + ": pay " + amount1 + " shekels each");
	     
	}
}
