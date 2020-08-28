
class Pat1 {

	public static void main(String[] args) {

		//Accepting the no of rows in rowCount
		int rowCount = 4;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= row) {

				System.out.print(row + "  ");
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}
