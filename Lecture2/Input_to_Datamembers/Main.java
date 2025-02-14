package Input_to_Datamembers;
public class Main{
	public static void main(String[] args){
		Book book1 = new Book();
		book1.getInput();
		Book book2 = new Book();
		book2.getInput();
		Book book3 = new Book();
		book3.getInput();

		book1.display();
		book2.display();
		book3.display();
	}
}
