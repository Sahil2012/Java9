
class AND {

	public static void main(String[] args) {

		//Looping in the range from 0 to 100
		for(int i = 1;i <= 100;i++) {

			//Checking for the condition
			if(i % 4 == 0 && i % 7 == 0) {

				System.out.print(i + " ");
			} 
		}
		System.out.println();
	}
}
