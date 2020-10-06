
import java.io.*;
import java.util.*;

class EvenMaxOdd {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* Accept the no of rows and columns */
		System.out.print("Enter the no of rows and columns : ");
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

		int sum = 0;

		/* Store the elements in array */
		System.out.println("Elements : ");
		for(int i = 0; i < arr.length; i++) {

			StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Integer.parseInt(st1.nextToken());

				if(arr[i][j] % 2 == 0)
					sum += arr[i][j];
			}
		}

		int max = arr[0][0];

		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < arr[i].length; j++) {

				if(arr[i][j] % 2 == 1 && arr[i][j] > max)
					max = arr[i][j];
			}
		}

		System.out.println("Sum of Even nos in array : " + sum);
		System.out.println("Maximum odd no in array : " + max);
		System.out.println("Multplication : " + (sum*max));
	}
}
