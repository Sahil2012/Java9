
class Pattern1 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 9;
		char ch = 'A';

		for(int row = 1,col = 1; row <= rowCount;) {

			if(col <= rowCount) {

				if(row + col >= (rowCount + 1)) {

					System.out.print(ch + " ");
					ch ++;
				} else {
				
					System.out.print("  ");
				}
				col++;
			} else {
				ch = ((char)((int)'A' + row));
				col = 1;
				row ++;
				System.out.println();
			}
		}
	}
}
