
class Pattern2 {

	public static void main(String[] args) {

		int rowCount = 5;

		for(int row = 1,col = 1;row <= rowCount; ) {

			if(col <= (rowCount)) {

				if(col >= (rowCount + 1 - row))
					System.out.print(row + " ");
				else 
					System.out.print(" ");
				col ++;
			} else {

				System.out.println();
				row ++;
				col = 1;
			}
		}
	}
}
