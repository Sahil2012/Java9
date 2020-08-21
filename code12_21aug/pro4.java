
class Pat {

	public static void main(String... args) {

		//Store no of rows and columns in rowCount and columncount resp
		int rowCount = 4,columnCount = 4;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= columnCount) {

				System.out.print(2*column + "  ");
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}
