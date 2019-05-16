package businessLayer;

import java.util.Date;

public class DateN extends Date {
	public String getDayName() {
		switch(this.getDay()) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
			
		}
		return null;
	}
	public String getMonthName() {
		String monthString;
		switch(this.getMonth()) {
			case 0:  monthString = "January";
			        break;
			case 1:  monthString = "February";
			        break;
			case 2:  monthString = "March";
			        break;
			case 3:  monthString = "April";
			        break;
			case 4:  monthString = "May";
			        break;
			case 5:  monthString = "June";
			        break;
			case 6:  monthString = "July";
			        break;
			case 7:  monthString = "August";
			        break;
			case 8:  monthString = "September";
			        break;
			case 9: monthString = "October";
			        break;
			case 10: monthString = "November";
			        break;
			case 11: monthString = "December";
			        break;
			default: monthString = "Invalid month";
			        break;
			}
		return monthString;
		}
}
