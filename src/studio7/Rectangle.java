package studio7;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double a, double b) {
		length=a;
		width=b;
	}
	public double getlength() {
		return length;
	}
	public double getwidth() {
		return width;
	}
	public double area() {
		return this.getlength()*this.getwidth() ;
	}
	public double perimeter() {
		return (this.getlength()+this.getwidth())*2 ;
	}
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(1,2);
		Rectangle R2= new Rectangle(2,3);
		double area1= R1.area();
		double area2= R2.area();
		double perimeter= R1.perimeter();
		System.out.println(area1);
		System.out.println(perimeter);
		if(area1>area2) {
			System.out.println("Rectangle with (1,2)is bigger");
		}
		if(area2>area1) {
			System.out.println("Rectangle with (2,3)is bigger");
		}
		if(R1.getlength()==R1.getwidth()) {
			System.out.println("Square");
		}
		else {
			System.out.println("Not Square");
		}
	}
}
