
class Pattern {

	public static void main(String[] args) {

		int rowCount = 4;

		for(int row = 1,col = 1; row <= rowCount;) {

			if(col < (rowCount + row)) {

				if(col == (rowCount + 1 - row)||col == (rowCount + row - 1))
					System.out.print(row + " ");
				else
					System.out.print("  ");
				col ++;
			} else {

				System.out.println();
				row ++;
				col = 1;
			}
		}
	}
}
