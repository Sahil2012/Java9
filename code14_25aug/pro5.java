
class Pat {

	public static void main(String[] args) {

		//Accept no of rows and columns in rowCount and columnCount resp
		int rowCount = 4,columnCount = 4;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= columnCount) {

				if(row % 2 == 0) 
					System.out.print("1  ");
				else 
					System.out.print("0  ");
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}

