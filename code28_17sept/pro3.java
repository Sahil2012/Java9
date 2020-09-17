
class Pattern3 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 5;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(row == 1 || row == rowCount) {

				if(col <= rowCount) {

					System.out.print(row + " ");
					col ++;
				} else {

					col = 1;
					row ++;
					System.out.println();
				}
			} else {

				if(col <= 2) {

					System.out.print(row + " ");
					col++;
				} else {

					col = 1;
					row ++;
					System.out.println();
				}
			}
		}		
	}
}
