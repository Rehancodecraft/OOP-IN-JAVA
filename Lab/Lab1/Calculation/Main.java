package Calculation;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = input.nextDouble();
		System.out.print("Enter y: ");
		double y = input.nextDouble();

		System.out.print("Enter Operator: ");
		char op = input.next().charAt(0);
		Math M1 = new Math();
		M1.setx(x);
		M1.sety(y);
		M1.calculate(op);
	}
}
		
		

