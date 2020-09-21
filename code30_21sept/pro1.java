
class Pattern1 {

	public static void main(String[] args) {

		int rowCount = 3;	
		
		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= rowCount + row - 1) {

				if(col <= row - 1) 
					System.out.print("  ");
				else 
					System.out.print("* ");
				col ++;
			} else {

				row ++;
				col = 1;
				System.out.println();
			}
		}
	}
}
