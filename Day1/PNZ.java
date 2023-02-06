package Day_1;
import java.util.*;

public class PNZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		Scanner S = new Scanner(System.in);
		number =S.nextInt();
		if (number>0)
			System.out.println("Number is positive ");
		else if(number==0)
			System.out.println("Number is Zero");
		else 
			System.out.println("Number is Negative");
		S.close();

	}

}
