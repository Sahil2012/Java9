
class Pattern1 {

	public static void main(String[] args) {

		int rowCount = 5,count = 1;

		for(int row = 1,col = 1;row <= rowCount;) {

			if(col <= row) {
	
				System.out.print(count + " ");
				col++;
				count --;
			} else {

				col = 1;
				row ++;
				System.out.println();
				count = row;
			}
		}
	}
}
