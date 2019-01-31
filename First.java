package Math_Function_Prac;

import java.util.Scanner;

public class First {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number : ");
		int x = sc.nextInt();
		System.out.println("Enter second number : ");
		int y = sc.nextInt();
		System.out.println("Absolute Value of "+x+" is : "+Math.abs(x));
		///Maximum value check-----
		
		System.out.println("Maximum of "+x+" y"+y+" is : "+Math.max(x, y));
		///Minimum number check--------
		
		System.out.println("Minimum num is : "+Math.min(x, y));
		
		
		System.out.println(Math.floorDiv(x, y));
		
		System.out.println(Math.multiplyExact(x, y));
		
	}

}
