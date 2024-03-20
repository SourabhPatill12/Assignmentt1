package in.juhu.cdac;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in); 
		 System.out.print("Enter number (1-7): ");
		 int Weekday= sc.nextInt(); 
		 sc.close();

		String weekdayName;

		switch (Weekday) {
		case 1:
			weekdayName="Monday";
			break;

		case 2:
		    weekdayName="Tuesday"; 
		break;

		case 3:
			weekdayName="Wednesday"; 
			break;

		case 4:
		    weekdayName="Thursday";
		   break;
		
		case 5:
			weekdayName="Friday";
			break;

	     case 6:

			weekdayName="Saturday";
			break;

			case 7:
				weekdayName="Sunday";
			break;

			default:
			    weekdayName ="Invalid";
		}

			System.out.println("The Day is :  "+weekdayName);
		}
	
}


