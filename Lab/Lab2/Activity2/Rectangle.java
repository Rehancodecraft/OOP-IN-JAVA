package Lab2.Activity2;
public class Rectangle{
	public int length, width;
	public Rectangle(){
		length = 5;
		width = 2;
	}
	public Rectangle(int len, int wid){
		length = len;
		width = wid;
	}
	public int CalculateArea(){
		return (length * width);
	}
}
