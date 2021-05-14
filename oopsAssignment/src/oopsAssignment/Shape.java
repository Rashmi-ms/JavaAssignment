package oopsAssignment;

abstract class Shape {
		 abstract void draw();
		 }
class Line extends Shape
{

	
	void draw() {
	     System.out.println("Drawing Line");
		
	}
	
}
	class Rectangle extends Shape
	{
		void draw() {
		     System.out.println("Drawing Rectangle");
			
		}
	}
	class Cube extends Shape
	{
		void draw() {
		     System.out.println("Drawing Cube");
			
		}
	}



