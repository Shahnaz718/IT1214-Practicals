class One{
	int a=10; //variable definition
	int b;    //variable declaration
	
	void print_details(){ //method
		System.out.println("From Class One a="+a);
		System.out.println("From Class One b="+b);
	
	}
}

class Two{
	int a,c; //declaration only 
	void print_details(){ //method
		System.out.println("From Class Two a="+a);
		System.out.println("From Class Two c="+c);
	
	}
}

class App{
	public static void main(String[] args){
		One o1=new One();
		Two t1=new Two();
		o1.print_details();
		o1.b=100;
		o1.print_details();
		t1.print_details();
		t1.a=20;
		t1.c=30;
		t1.print_details();
		
}
}