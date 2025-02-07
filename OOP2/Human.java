public class Human{
	//This is  a non-static variable so we acces it by a refrence variable or an instance of that class//
	String message = "Hello, world";
	public static void display(Human human){
		System.out.println(human.message);
	}
	public static void main(String[] args){
		// here rehan is an instance of the class Human
		Human rehan = new Human();
		// here we are accessing a non static variable by the a refrence of instance of that class
		rehan.message = "Rehan's message";
		// As the method display is static so we are assessing it directly throuhg the class name witout any refrence of the an isntance of that class 
		Human.display(rehan);
	}
}
