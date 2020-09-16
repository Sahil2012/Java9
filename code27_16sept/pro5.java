
class Pattern5 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 10;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(row <= (rowCount / 2) && col <= ((rowCount / 2) + 1 - row)) {

				System.out.print("= ");
				col ++;
			} else if(row > (rowCount / 2) && col <= (row - rowCount / 2)) {

				System.out.print("* ");
				col ++;
			} else {

				col = 1;
				row ++;
				System.out.println();
			}
		}
	}
}
