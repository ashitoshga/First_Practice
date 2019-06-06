
public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4;
		
		String monthname;
		switch (i)
		{
		
		case 1: monthname = "Jan";
		break;
		case 2: monthname = "Feb";
		break;
		case 3: monthname = "Mar";
		break;
		case 4: monthname = "Apr";
		break;
		case 5: monthname = "May";
		break;
		case 6: monthname = "Jun";
		break;
		case 7: monthname = "Jul";
		break;
		case 8: monthname = "Aug";
		break;
		case 9: monthname = "Sep";
		break;
		case 10: monthname = "Oct";
		break;
		case 11: monthname = "Nov";
		break;
		case 12: monthname = "Dec";
		break;
		default: monthname = "invalid data";
				break;
		}
	System.out.println(monthname);
	}
}
