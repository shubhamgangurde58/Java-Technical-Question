
import java.util.Scanner;

class CheckAutomorphicNo{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int temp = num;
		
		if(num < 0){
			System.out.println("Number is Invalid ");
			return;
		}

		long square = (long) num * num;
		long count = 1;

		while(temp > 0){
			temp = temp / 10;
			count *= 10;
		}
		
		long a = square % count;
		
		if(a == num && num > 0){
			System.out.println("Number is Automorphic "+square);
		}else if(num > 0){
			System.out.println("Number is Not Automorphic "+square );
		}

	}
}