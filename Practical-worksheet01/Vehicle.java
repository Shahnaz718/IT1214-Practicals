class Vehicle {
	String brand;
	int speed;
	
void display() {
	System.out.println("vehicle brand:"+brand);
	System.out.println("vehicle speed:"+speed);
	}
}
class Car extends Vehicle {
	String model;
	@Override
	
void display() {
	super.display();
	System.out.println("vehicle model:"+model);
	
}
public static void main(String[] args){
	Car car = new Car();
	car.brand = "Toyota";
	car.speed = 120;
	car.model = "Corolla";
	car.display();
}

}