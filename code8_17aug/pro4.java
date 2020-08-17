
class Pat {

	public static void main(String... args) {
	
		for(int i = 1,j = 1;i <= 4;) {

			if(j <= 4) {

				System.out.print("*  ");
				j++;
			} else {

				j = 1;
				i++;
				System.out.println();
			}
		}
	}
}
