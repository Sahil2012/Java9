
class OR {

	public static void main(String[] args) {

		//Loopin in the range of 1 to 100
		for(int i = 1;i <= 100;i++) {

			//Checking for the condition
			if(i % 5 == 0 || i % 3 == 0) {
	
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
