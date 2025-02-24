package Lecture3.Product;
import java.util.*;
public class Product{
	Scanner input = new Scanner(System.in);
	private int id = 0;
	private String p_name;
	private double price;
	private int quantity ; 
	private int action;
	static int totalQuantity = 0;
	Product(){
		id++;
		p_name = "Nill";
		price = 0;
		quantity = 0;
	}
	void askaction(){
		System.out.println("1.ADD Product\n2.Sale Product");
		action = input.nextInt();
		runaction(action);
	}
	void runaction(int action){
		if(action == 1){
			addproduct();
		}
		else if(action == 2){
			saleproduct();
		}
		else{
			System.out.println("Enter a valid action");
		}
	}
		
	void addproduct(){
		System.out.print("Enter the name of Product: ");
		input.nextLine();
		p_name = input.nextLine();
		System.out.print("Enter the price of product: ");
		price = input.nextDouble();
		System.out.print("Enter the quantity of product: ");
		quantity = input.nextInt();
		totalQuantity +=quantity;
	}
	void saleproduct(){
		System.out.print("What quantity you want to sale: ");
		int qnt = input.nextInt();
		if(quantity < qnt){
			System.out.println("You have less quantity");
		}
		else{
			quantity -= qnt;
			totalQuantity -= qnt;
		}
	}
}
	
		

