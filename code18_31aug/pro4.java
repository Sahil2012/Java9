
class Pat {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 5;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= row) {

				if(row % 2 == 1) {
		
					System.out.print(0 + " ");
				} else {
					
					System.out.print(1 + " ");
				}
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}	
		}
	}
}
