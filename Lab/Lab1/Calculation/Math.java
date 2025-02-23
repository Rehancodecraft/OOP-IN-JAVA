package Calculation;
public class Math{
	private double x;
	private double y;
	private char op;
	public void setx(double x){
		this.x = x;
	}
	public void sety(double y){
		this.y = y;
	}
	public void calculate(char op){
		double result = 0;
		switch(op){
			case '+'-> result = x + y;
			
			case '-'-> result = x - y;
			case '/'-> result = x / y;
			case '*'-> result = x * y;
			default -> System.out.println("Invalid operator");
		}
			System.out.println("Result: " + result);
	}
}

