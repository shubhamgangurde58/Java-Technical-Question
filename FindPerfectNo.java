
import java.util.Scanner;

class FindPerfectNo{
	
	public static void main(String args[]){	

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		int temp = num;

		int sum = 0;

		if(num <= 0){
			System.out.println("Invalide input ! ");
		}else{

			for(int i=1 ; i<num ; i++){
				
				if(num % i == 0){
					
					sum = sum + i;
		
				}
			
			}
			
		}
		if(num > 0 && sum == temp){
			System.out.println("Number is Perfect "+sum);
		}else if(num > 0){
			System.out.println("Number is Not Perfect "+sum);
		}
		
	}

}