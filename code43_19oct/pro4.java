
import java.io.*;
import java.util.*;

class SumArr {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size : ");
		int[] arr = new int[Integer.parseInt(br.readLine().trim())];

		System.out.print("Enter the Elements : ");
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		int sum = 0;

		/* Accept the elements in arr */
		for(int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken().trim());

			/* Calculate the sum of array */
			sum += arr[i];
		}

		System.out.println("Sum = " + sum);

	}
}
