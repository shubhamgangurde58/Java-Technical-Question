import java.util.Scanner;

class SecondLargest{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Value : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Value : ");
		int b = sc.nextInt();
		System.out.println("Enter the Thrid Value : ");
		int c = sc.nextInt();

		int largest = 0;
		int secondLargest =0;

		if ((a > b && a < c) || (a > c && a < b)) {
    			secondLargest = a;
		}
		else if ((b > a && b < c) || (b > c && b < a)) {
   		 	secondLargest = b;
		}
		else if ((c > a && c < b) || (c > b && c < a)) {
   		 	secondLargest = c;
		}		

		

		System.out.println("Second Largest = "+ secondLargest);
	
	}

}