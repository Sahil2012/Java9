
class Pattern4 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 5;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= row) {

				System.out.print((col % 2) + " ");
				col ++;
			} else {

				col = 1;
				row ++;
				System.out.println();
			}
		}
	}
}
