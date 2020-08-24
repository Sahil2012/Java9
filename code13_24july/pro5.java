
class Pat {

	public static void main(String... args) {

		//take no of row and column in rowCount and columnCount resp
		int rowCount = 4,columnCount = 4;


		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= columnCount) {

				System.out.print(0 + "  ");
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}
