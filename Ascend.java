// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		int num1 = (int) (Math.random()* num) ;
		int num2 = (int) (Math.random()* num) ;
		int num3 = (int) (Math.random()* num) ;
		int max12 = Math.max(num1,num2);
		int max23 = Math.max(num3,num2);
		int Max = Math.max(max12,max23);
		int min12 = Math.min(num1,num2);
		int min23 = Math.min(num3,num2);
		int Min = Math.min(min12,min23);
		int Mid = num1+num2+num3-Max-Min;
		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.println(Min + " " + Mid + " " + Max);
		// Replace this comment with your code
	}
}
