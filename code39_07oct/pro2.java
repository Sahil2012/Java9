
import java.io.*;
import java.util.*;

class JaggedSq {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* Accept the no of rows */
		System.out.print("Enter the no of rows : ");
		int[][] arr = new int[Integer.parseInt(br.readLine())][];

		/* Accept the no of cols for each row */
		for(int i = 0; i < arr.length; i++) {

			System.out.print("Enter the no of columns in row " + (i+1) + " : ");
			arr[i] = new int[Integer.parseInt(br.readLine())];
		}

		/* Accept the elements in arr */
		int x = 1;
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				arr[i][j] = x * x;
				x ++;
			}
		}
		
		System.out.println("The Elements are : ");
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
