package constructor;
public class Main{
	public static void main(String[] args){
		Person P1 = new Person(11, "Rehan Shafiq",19);
		Person P2 = new Person(12, "Uzair Usman",20);
		
		Person.display();
		P2.display();
	}
}
