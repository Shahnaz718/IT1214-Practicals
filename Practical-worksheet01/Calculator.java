 class Calculator{
	
	 int add(int a,int b){
		return a+b;
	}
	
	 int add(int a,int b,int c){
		return a+b+c;
	}
	
	 double add(double a,double b){
		return a+b;
	}
	 double add(double a,double b,double c){
		return a+b+c;
	}
	
	public static void main(String[] args){
		Calculator calc=new Calculator();
		System.out.println("add two integers:"+calc.add(2,3));
		System.out.println("add three integers:"+calc.add(2,3,4));
		System.out.println("add two doubles:"+calc.add(2.5,3.5));
		
	}
}