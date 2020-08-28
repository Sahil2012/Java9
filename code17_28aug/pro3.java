
class Pat3 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 4,count = 1;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= row) {
	
				System.out.print(count + "  ");
				count++;
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}
