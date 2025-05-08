//this is a comment
//this is our first java program

import java.io.*; //this is how we import packages

public class MySecondClass
	{ //class name should start with capital letter
	public static void main(String[] args) {
		if (args.length >=2){
			System.out.println(args[0]+" "+args[1]);
		}
		else{
			System.out.println("Please psss at least 2 arguments.");
		}

	}
}

//java MySecondClass How are you
//output How you are