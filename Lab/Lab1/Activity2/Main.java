package Lab1.Activity2;
public class Main{
	public static void main(String[] args){
		//this is called two-step declaration
		Date date1,date2;

		date1 = new Date();
		date1.month = "November";
		date1.day = 17;
		date1.year = 2006;
		System.out.println("Date 1");
		date1.displayDate();

		date2 = new Date();
		date2.month = "July";
		date2.day = 3;
		date2.year = 2007;
		System.out.println("Date 2");
		date2.displayDate();
	}
}
