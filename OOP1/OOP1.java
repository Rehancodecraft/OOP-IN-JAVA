import java.util.*;
import java.util.Arrays;
public class OOP1{

	public static void main(String[] args){
//	Student[] Students = new Student[5];
	Student student1 = new Student(45,"Adnan Shafiq", 97.5f);
	Student random = new Student(student1);
	Student random2 = new Student();

//	Student student2 = new Student();
	System.out.println("Roll NO: "+ random2.rno);
	System.out.println("Name: " + random2.name);
	System.out.println("Marks: "+ random2.marks);
	
	System.out.println("Roll NO: "+ student1.rno);
	System.out.println("Name: " + student1.name);
	System.out.println("Marks: "+ student1.marks);

	
//	System.out.println("Roll NO: "+ student2.rno);
//	System.out.println("Name: " + student2.name);

//	System.out.println("Marks: "+ student2.marks);
//	student2.greetings();
	
}
} 
	class Student {
		int rno;
		String name;
		float marks;
		void greetings(){
			System.out.println("Hello, My name is " + this.name);}
		Student(){
			this (13, "random", 100.0f);	
		}
		Student(Student other){
			this.name = other.name;
			this.rno = other.rno;
			this.marks = other.marks;
		}
		Student(int rno, String name, float marks){
			this.rno = rno;
			this.name = name;
			this.marks = marks;}
}
