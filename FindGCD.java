
import java.util.Scanner;
class FindGCD{

	public static void main(String args[]){

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 2 Number : ");
		long a =  sc.nextLong();
		long b =  sc.nextLong();
		long gcd = 0;		

		if(a == 0 && b == 0 ){

			System.out.println("GCD is Undefine ");

		}else if(a == 0 || b == 0){
			
			gcd = Math.max(a,b);
			System.out.println("GCD = "+gcd);			
			
		}else{
		
			long size = Math.min(a,b);

			for(long i=1; i<=size ; i++){

				if(a%i==0 && b%i==0){
					gcd = i;
				}				

			}
		}

		System.out.println("GCD of give 2 Number : "+gcd);
	
	}

}