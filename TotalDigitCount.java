
import java.util.Scanner;
class TotalDigitCount{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();	

		int count = 0;
		
		if(num == 0){
		   count ++;
		}

		while(num != 0){
			num = num / 10;
			count ++;
		}

		System.out.println("Total Digit : "+ count);


	}

}