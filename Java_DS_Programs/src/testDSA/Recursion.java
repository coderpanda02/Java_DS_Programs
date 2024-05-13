package testDSA;

import java.util.Scanner;

public class Recursion {
	
	private int fact(int n) {
		
//		int f=1;
		if(n==0 || n==1)
			return 1;
		else
		    // f = n * fact(n-1);  //non-tail recursion -> as here the next operation is to assign the value in f
		    // return f;
		
		return n * fact(n-1); //tail recursion -> recursive call is the last operation of the method before returning
		
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. : ");
		int n =sc.nextInt();
		
		Recursion rc= new Recursion();
		
		int factorial = rc.fact(n);
		System.out.println(factorial);
		
		sc.close();

	}
}
