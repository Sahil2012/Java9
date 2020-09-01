
class Pat {

	public static void main(String[] args) {

		int rowCount = 5;

		for(int row = 1,column = 1;row <= rowCount;) {

			if(column <= row) {

				if(row % 2 == 0)
					System.out.print("A ");
				else 
					System.out.print("a ");
				column++;
			} else {

				column = 1;
				row++;
				System.out.println();
			}
		}
	}
}
