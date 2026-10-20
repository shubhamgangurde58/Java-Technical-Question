
import java.util.Scanner;
class AmstrongNumber{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 digit number : ");
		int  num = sc.nextInt();

		int temp = num;
		int count = 0;
		int n = num;
		int rev = 0;

		do{
			count ++;
			n = n / 10;
		}while(n != 0);


		while(num > 0){

			int reminder = num % 10;
			rev = rev + (int) Math.pow(reminder ,count);
			num = num / 10;				

		}

		if(rev == temp){
			System.out.println("Number is Amstrong ");
		}else{
			System.out.println("Number is Not Amstrong ");
		}
		

	}
}