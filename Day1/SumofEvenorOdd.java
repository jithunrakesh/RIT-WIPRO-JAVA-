package Day_1;

import java.util.Scanner;

public class SumofEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner S = new Scanner(System.in);
		a=S.nextInt();
		b=S.nextInt();
		
		c=a+b;
		if (c%2==0) 
			System.out.println("Sum of the two number is even");
		else
			System.out.println("Sum of the two number  is odd ");
		S.close();

	}

}
