
class Pattern3 {

	public static void main(String[] args) {

		//Accept the no of rows in rowCount
		int rowCount = 4,count = 1;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= row) {

				System.out.print((count * count) + 1 + "\t");
				count++;
				col ++;
			} else {

				col = 1;
				row ++;
				System.out.println();
			}
		}
	}
}	
