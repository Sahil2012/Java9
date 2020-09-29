
class Pattern {

	public static void main(String[] args) {

		char[] arr = {'A','B','C','D','E'};

		for(int row = 0,col = 0; row < arr.length;) {

			if(col < (arr.length - row)) {
	
				System.out.print(arr[col + row] + " ");
				col ++;
			} else {

				System.out.println();
				row ++;
				col = 0;
			}
		}
	}
}
