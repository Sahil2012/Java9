
class Pattern4 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 5;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= rowCount) {

				if(row + col >= (2*row)) {

					System.out.print((row * col) + "\t");
				} else {

					System.out.print(" \t");
				}
				col ++;
			} else {

				col = 1;
				row ++;
				System.out.println();
			}
		}		
	}
}
