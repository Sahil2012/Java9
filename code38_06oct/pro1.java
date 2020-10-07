
import java.io.*;
import java.util.*;

class SumArr {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* Accept the no of planes,rows and columns */
		System.out.print("Enter the no of Plane : ");
		int p = Integer.parseInt(br.readLine());
		System.out.print("Enter the no of Rows : ");
		int r = Integer.parseInt(br.readLine());
		System.out.print("Enter the no of Columns : ");
		int c = Integer.parseInt(br.readLine());

		int[][][] arr = new int[p][r][c];
		int sum = 0;		

		/* Accept the elements in arr */
		System.out.print("Enter Elements : ");
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < p; i++) {

			for(int j = 0; j < r; j++) {

				for(int k = 0; k < c; k++) {

					arr[i][j][k] = Integer.parseInt(st.nextToken());
					/* Calculating the sum */
					sum += arr[i][j][k];
				}
			}
		}

		System.out.println("Sum = " + sum);
	}
}
