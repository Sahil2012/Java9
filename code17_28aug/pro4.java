
class Pat4 {

	public static void main(String[] args) {

		//Accept the no of rows from user
		int rowCount = 4;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= row) {

				System.out.print("*  ");
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}

	}
}
