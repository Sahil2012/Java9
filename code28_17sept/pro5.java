
class Pattern5 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 12;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(row <= (rowCount / 2)){

				if(col <= (rowCount/2) - row + 1) {

					System.out.print((char)(64 + col) + " ");
					col ++;
				} else {

					col = 1;
					row ++;
					System.out.println();
				}
			} else {

				if(col <= (row - (rowCount/2))) {

					System.out.print((char)(64 + col) + " ");
					col ++;
				} else {

					col = 1;
					row ++;
					System.out.println();
				}
			}
		}
	}
}
