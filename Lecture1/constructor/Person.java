
package constructor;
public class Person{
	//We have make these datamembers public to accessible from everywhere
	public int id;
	public String name;
	public int age;
	//This is constructor
	Person(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;

	}
	public static void display(){
		System.out.println("ID: "+ id);

		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
	}
}

