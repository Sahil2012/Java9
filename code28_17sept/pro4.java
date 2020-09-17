
class Pattern4 {

	public static void main(String[] args) {

		//Accept the no orf rows in rowCount
		int rowCount = 5;
		int count = (rowCount + 1) / 2;


		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= rowCount) {

				if(row <= (rowCount + 1) / 2) {

					if(row > col) {

						System.out.print(count + " ");
						count --;
					} else if(row + col > rowCount) {

						System.out.print(count + " ");
						count ++;
					} else {

						System.out.print(count + " ");
					}
				} else {

					if(row + col <= rowCount) {

						System.out.print(count + " ");
						count --;
					} else if(col >= row) {

						System.out.print(count + " ");
						count ++;
					} else {

						System.out.print(count + " ");
					}
				}
				col ++;
			} else {

				count = (rowCount + 1) / 2;
				col = 1;
				row ++;
				System.out.println();
			}
		}
	}
}
