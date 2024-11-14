// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat 
{
	public static void main(String[] args) 
	{
		
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		String timeNow = args[0];
		String hours1 = "" + args[0].charAt(0) + args[0].charAt(1);
		// Does the same with the minutes part of the input.
		String minutes1 = "" + args[0].charAt(3) + args[0].charAt(4);
		int hours2 = Integer.parseInt(hours1);
		int minutes2 = Integer.parseInt(minutes1);
		if(hours2<12)
			System.out.println(timeNow + " AM");
		else
			if(hours2==12)
				System.out.println(timeNow + " PM");
			else
			{
				hours2 = hours2-12;
				System.out.println(hours2 + ":" +minutes2 + " PM");
		    }	
			
			
        // Replace this comment with the rest of your code
	}
}