
import java.io.*;

class Jagged {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* Take the no of rows from user */
		System.out.print("Enter the no of rows : ");
		int[][] arr = new int[Integer.parseInt(br.readLine())][];

		/* getting the no of column */
		for(int i = 0; i < arr.length; i++) {

			arr[i] = new int[i + 1];
		}

		/* Accept the elemnts in jagged array */
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
