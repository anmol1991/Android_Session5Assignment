import java.util.Scanner;

abstract class Figure{
	double dim1;
	abstract void findArea();
	abstract void findPerimeter();
}

class Circle extends Figure{
	double area,perimeter;
	Circle(double r)
	{
		dim1 = r;
		area = 0;
		perimeter = 0;
	}
	void findArea(){
		area = 3.14*dim1*dim1;
		System.out.println("Area of Circle : " + area);
		
	}
	void findPerimeter(){
		perimeter = 2 * 3.14 * dim1;
		System.out.println("perimeter of Circle : " + perimeter);
	}
	
}
class Rectangle extends Figure{
	double l,b,area,perimeter;
	Rectangle(double l , double b)
	{
		this.l = l;
		this.b = b;
		area = 0;
		perimeter = 0;
	}
	void findArea(){
		area = l*b;
		System.out.println("Area of Rectangle : " + area);
	}
	void findPerimeter(){
		perimeter = 2 * (l + b);
		System.out.println("perimeter of Rectangle : " + perimeter);
	}
}
class Triangle extends Figure{
	double b,h,area,perimeter;
	Triangle(double b , double h)
	{
		this.h = h;
		this.b = b;
		area = 0;
		perimeter = 0;
		
	}
	void findArea(){
		area = 0.5*b*h;
		System.out.println("Area of Triangle : " + area);
		
	}
	void findPerimeter(){
		/*perimeter = 2 * (h + b);*/
		System.out.println("perimeter of Triangle :  Insufficient data to calculate perimeter" );
		
	}
}
public class Session5Assignment1 {
	public static void main(String s[]){
		Circle c = new Circle(2);
		Triangle t = new Triangle(2,3);
		Rectangle r = new Rectangle(2,4);
		 c.findArea();
		 c.findPerimeter();
		 t.findArea();
		 t.findPerimeter();
		 r.findArea();
		 r.findPerimeter();
		 
	}

}
