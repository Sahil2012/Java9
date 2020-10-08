
class Marks {

	public static void main(String[] args) {

		int[][] arr = new int[3][];

		arr[0] = new int[] {50,60,70,90};
		arr[1] = new int[] {20,40,80};
		arr[2] = new int[] {55,77,66,91};

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
			System.out.println("Average of Student " + (i+1) + " : " + ((float)sum / arr[i].length));
		}
	}
}
