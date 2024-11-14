// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// inputs three values, and sends a message with the future value
		double currentvalue = Double.parseDouble(args[0]);
		double perc = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		if(years == 0)
			System.out.println(currentvalue + "saved at" + perc + "%");
		else
		{
			int i = 0;
			double nvalue = currentvalue;
			while(i<years)
			{
				nvalue = nvalue *(1 + perc/100);
				i = i +1 ;
			}
			System.out.println("After " + years + " years, " + currentvalue + "$ saved at " + perc + "% will yield " + (int) nvalue + "$");
		}		
	}
}