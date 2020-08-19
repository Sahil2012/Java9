
class Pat1 {

	public static void main(String... args) {

		//taking no of rows and columns in rowCount ans columnCount resp
		int rowCount = 4,columnCount = 4;

		for(int row = 1,column = 1;row <= rowCount;){
	
			if(column <= columnCount) {

				System.out.print(column + "  ");
				column ++;
			} else {

				column = 1;
				row ++;
				System.out.println();
			}
		}
	}
}
