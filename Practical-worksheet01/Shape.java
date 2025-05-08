class Shape {
 
 void area(){
	System.out.println("Area not defined");
	}
}
 
class Circle extends Shape{
	double radius;
 
	Circle(double radius) {
		this.radius = radius;
	}
 
 @Override
 
void area() {
 // Calculate and display area
	double result=Math.PI *radius*radius;
	System.out.println("area of circle: "+result);
	}
	public static void main(String[] args){
	Circle circle = new Circle(5.0);
	circle.area(); 
	}
}


