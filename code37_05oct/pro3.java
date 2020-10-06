
import java.io.*;
import java.util.*;

class Add {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* Accept the no of rows and columns */
		System.out.print("Enter the no of rows and columns : ");
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
		int[][] arr1 = new int[arr.length][arr[0].length];
		int[][] arr2 = new int[arr.length][arr[0].length];

		/* Store the elements in array */
		System.out.println("Elements : ");
		for(int i = 0; i < arr.length; i++) {

			StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Integer.parseInt(st1.nextToken());
			}
		}

		for(int i = 0; i < arr.length; i++) {

			StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < arr[i].length; j++) {

				arr1[i][j] = Integer.parseInt(st1.nextToken());
			}
		}

	
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				arr2[i][j] = arr[i][j] + arr1[i][j];	
			}
		}

		System.out.println("The third matrix is : ");
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
