
class Pattern1 {

	public static void main(String[] args) {

		//accept the  no of rows in rowCount
		int rowCount = 5;
		char ch = 'C';

		for(int row = 1,col = 1;row <= rowCount;) {
		
			if(col <= row) {

				System.out.print(ch + " ");
				ch = (char)((int)ch + 4);
				col ++;
			} else {

				col = 1;
				row ++;
				System.out.println();
				ch = 'C';
			}
		}
	}
}
