 class Employee{
	String name;
	int id;
	double salary;
	
 Employee(String name, int id, double salary){
 // Initialize attributes
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
 void displayDetails() {
 // Display employee details
	System.out.println("Employee name: "+name);
	System.out.println("Employee id: "+id);
	System.out.println("Employee salary: $"+salary);
 }
 }
 class Manager extends Employee{
	Manager(String name, int id, double salary){
	super(name, id, salary);
 }
 @Override
 void displayDetails() {
	 super.displayDetails();
	 double bonus=salary*0.20;
	 System.out.println("Manager bonus: $"+bonus);
 // Display employee details and bonus
 }
 public static void main(String[] args){
	  Manager manager = new Manager("Bob", 201, 75000);
		manager.displayDetails();
	}
 }