
import java.util.Scanner;

class SwapNumber{

	public static void main(String args[]){	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int b = sc.nextInt();

		System.out.println("Before Swap a = "+ a +" b = "+ b);
		
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swap a = "+ a +" b = "+ b);
		
	}
}