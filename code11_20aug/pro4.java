
class Pat {

	public static void main(String[] args) {

		//Store no of rows and column in rowCount and columnCount resp
		int rowCount = 4,columnCount = 4,count = 1;
		
		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= columnCount) {

				System.out.print(count + "\t");
				column++;
				count++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}
