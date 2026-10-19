
import java.util.Scanner;

class PalindromeNumber{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int reminder = 0;
		int rev = 0;

		while(num > 0){
		
			reminder = num % 10;
			rev = rev * 10 + reminder;
			num = num / 10;

		}
		if(rev == temp){
			System.out.println(rev +" Number is Palindrome ");
		}else{
			System.out.println(rev +" Number is Not Palindrome");
		}
	}
}