import java.util.Scanner;
class PrimeNumber{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int flag = 0;

		if(num == 1 || num == 2){
			flag = 0;
		}

		for(int i=2; i<num ; i++){
	
			if(num % i == 0){
			
				flag ++;
				break;
			}
		
		}

		if(flag == 0){
			System.out.println("Number is Prime ");
		}else{

			System.out.println("Number is Not Prime");
		}
	
	}

}