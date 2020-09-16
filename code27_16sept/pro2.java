
class Pattern2 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 4;
		char ch = 'A';

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= rowCount) {

				if(col >= row) {

					System.out.print(ch + " ");
					ch ++;
				} else {

					System.out.print("  ");
				}
				col ++;
			} else {
	
				col = 1;
				row ++;
				System.out.println();
				ch = 'A';
			}
		}
	}
}
