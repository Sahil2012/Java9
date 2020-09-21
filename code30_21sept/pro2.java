
class Pattern2 {

	public static void main(String[] args) {

		int rowCount = 3;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= (2 * rowCount) - row) {

				if(col <= rowCount - row) 
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
