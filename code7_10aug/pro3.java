
class Prime {

	public static void main(String[] args) {
	
		int i = 10;

		for(int x = 1;x <= 10;x++) {

			int temp = 0;
			
			for(int j =  2;j < x;j++) {

				if(x % j == 0) {

					temp = 1;
					break;
				} else {

					temp = 0;
				}
			}

			if(temp == 0)
				System.out.println(x);
		}
	}
}
