package Lecture3.Circle;
public class Circle{
	private double radius;
	private double area;
	//circumference of circle
	private double cirf;
	//defauld constructor
	Circle(){
		//setting the default values
		radius = 1;
		area = 1;
		cirf = 0;
	}


	//setting the value of radius
	public void setradius(double radius){
		this.radius = radius;
	
	}


	//calculating the area
	public double calculateArea(){
		area = 3.14 * radius * radius;
		return area;
	}


	//calculating the circumference
	public double calculatecirf(){
		cirf = 2 * 3.14 * radius;
		return cirf;
	}
	//displaying all the three values
	public void display(){
		System.out.println("Radius of Circle: " + radius);
		System.out.println("Area of Circle: " + area);
		System.out.println("Circumference of Circle: " + cirf);

}
}

