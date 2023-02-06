package Day_1;

import java.util.*;
public class GreatorSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a :");
		a=S.nextInt();
		System.out.println("Enter the value of b :");
		b=S.nextInt();
		if (a>b)
			System.out.println(a+"is greater");
		else 
			System.out.println(b+"is greater");
		
		S.close();
	

	}

}
