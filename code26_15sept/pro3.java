
class Pattern3 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 7;
		
		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= rowCount) {

				if(row + col >= (rowCount + 1)) {

					System.out.print(col * col + "\t");
				} else {

					System.out.print(" \t");
				}
				col ++;
			} else {

				col = 1;
				row++;
				System.out.println();
			}	
		}
	}
}
