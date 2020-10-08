
class Books {

	public static void main(String[] args) {

		int[][] arr = new int[4][];

		arr[0] = new int[] {2,3,4,5};
		arr[1] = new int[] {1,2};
		arr[2] = new int[] {5,8,2,1,1};
		arr[3] = new int[] {1,2,7};

		/* Printing the array */
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		/* Calculate the sum for each person */
		for(int i = 0; i < arr.length; i++) {

			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];
			}
			System.out.println("Books read by Person " + (i+1) + " : " + sum);
		}
	}
}
