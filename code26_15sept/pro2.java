
class Pattern2 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 7,bin = 0;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= rowCount) {

				if(row + col >= (rowCount + 1)) {

					if(bin == 0) {
						
						System.out.print(bin + " ");
						bin = 1;
					} else {

						System.out.print(bin + " ");
						bin = 0;
					}
				} else {

					System.out.print("  ");
				}
				col++;
			} else {

				col = 1;
				row ++;
				bin = 0;
				System.out.println();
			}
		}
		
	}
}
