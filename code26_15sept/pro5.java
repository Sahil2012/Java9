
class Pattern5 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 5,count = 1;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= (rowCount - row + 1)) {

				System.out.print(count + "\t");
				count++;
				col ++;
			} else {

				col = 1;
				row++;
				count = (2*row) - 1;
				System.out.println();
			}
		}
	}
}
