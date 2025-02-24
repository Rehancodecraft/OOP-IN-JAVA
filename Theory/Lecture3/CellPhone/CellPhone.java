package Lecture3.CellPhone;
public class CellPhone{
		private String model;
		private int price;
		private int ram;
		CellPhone(){
			model = "NUll";
			price = 0;
			ram = 0;
		}
		CellPhone(String model, int price, int ram){
			this.model = model;
			this.price = price;
			this.ram = ram;
		}
		void display(){
			System.out.println("Model: " + model);
		 	System.out.println("Price: " + price);
			System.out.println("Ram: " + ram);
		}
}
