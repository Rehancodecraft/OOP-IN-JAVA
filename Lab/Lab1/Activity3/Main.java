package Lab1.Activity3;
import java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	CarPart car1 = new CarPart();
	System.out.print("What is Model Number: ");
	String modelno = input.nextLine();
	System.out.print("What is Part Number: ");
	String partno = input.nextLine();
	System.out.print("What is cost: ");
	String price = input.nextLine();
	car1.setparameter(modelno,partno,price);
	car1.display();
	}
}

