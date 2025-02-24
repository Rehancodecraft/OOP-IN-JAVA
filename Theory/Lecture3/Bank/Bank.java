package Lecture3.Bank;
import java.util.*;
public class Bank{
	
	
	Scanner input = new Scanner(System.in);
	private String name;
	private String bCode;
	private int balance;
	private int action;
	static int totalbalance = 0;
	static int totalaccounts;
	Bank(){
		name = "Nill";
		bCode = "Nill";
		balance = 2354364;
		
		totalaccounts++;
	}
	public void input(){
		System.out.print("Enter the name: ");
		name = input.nextLine();
		System.out.print("Enter the Branch Code: ");
		bCode = input.next();
	}
	public void askaction(){
		System.out.println("1.Deposite Money \n2.Withdraw Money");
		System.out.print("Enter your action: ");
		action = input.nextInt();
		runaction(action);
	}
	public void runaction(int action){
		if(action == 1){
			deposite();
		}
		else if(action == 2) {
			withdraw();
		}
		else{
			System.out.println("Enter a valid action");
		}
	}
	public void deposite(){
		System.out.print("Enter the Amount you want to deposite: ");
		int amount = input.nextInt();
		balance += amount;
		totalbalance += amount;
		System.out.println("Your Total Balance is: " + balance);
	}
	public void withdraw(){
		System.out.print("Enter the Amount you want to withdraw: ");
		int amount = input.nextInt();
		if(balance > amount){
		balance -= amount;
		totalbalance -= balance;
		System.out.println("Your Total Balance is: " + balance);
		}
		else{
			System.out.println("Your have Low balance");
		}
	}
}
	



