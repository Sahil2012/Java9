
import java.io.*;
import java.util.*;

class JaggedSum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* Take the no of rows from user */
		System.out.print("Enter the no of rows : ");
		int[][] arr = new int[Integer.parseInt(br.readLine())][];

		/* Accept the no of column */
		for(int i = 0; i < arr.length; i++) {

			System.out.print("Enter the no of cols in row " + (i+1) + " : ");
			arr[i] = new int[Integer.parseInt(br.readLine())];
		}

		int sum = 0;
		/* Accept the elemnts in jagged array */
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Integer.parseInt(br.readLine());
				/* Calculating the sum */
				sum += arr[i][j];
			}
		}

		System.out.println("Sum : " + sum);
	}
}
