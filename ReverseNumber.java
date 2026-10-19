class ReverseNumber{

	public static void main(String args[]){

		int num = 987654;
		int reminder = 0;
		int rev = 0;


		while(num > 0){
	
			reminder = num % 10;
			rev = rev * 10 + reminder ;
			num = num / 10;
	
		}
		
		System.out.println("Reverse Number: "+ rev);
		

	}
	
}