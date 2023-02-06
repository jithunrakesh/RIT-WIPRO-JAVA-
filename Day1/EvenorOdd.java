package Day_1;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int a ;
		System.out.println("Enter the value of a: ");
		a=S.nextInt();
		
		
		if (a%2==0) 
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd ");
		
		S.close();
	}

}
