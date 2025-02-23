package Input_to_Datamembers;
import java.util.*;
public class Book{
	public String title;
	public String author;
	public int price;
	//This is the constructor where we have set the default values
	Book(){
		title = null;
		author = null;
		price = 0;
	}
	//This is the function to take input from user
	public void getInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the title of book: ");
		title = input.nextLine();
		System.out.print("Enter the name of Author: ");
		author = input.nextLine();
		
		System.out.print("Enter the price of book: ");
		price = input.nextInt();
	}
	public void display(){

		System.out.println("Title ==> "+title);
		System.out.println("Author==>"+author);
		System.out.println("Price ==>"+price);
	}
	public static void heading(){
		
		System.out.println("Details of Book: ");
	}
}

