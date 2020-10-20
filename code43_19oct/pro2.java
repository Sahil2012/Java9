
import java.io.*;
import java.util.*;

class Reverse {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size of array : ");
		int[] arr = new int[Integer.parseInt(br.readLine())];

		System.out.print("Eneter the Elements : ");
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		/* Accept the values in arr */
		for(int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}

		/* Reverse the array */
		for(int i = 0; i < arr.length/2; i++) {

			arr[i] += arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
			arr[i] -= arr[arr.length - i - 1];
		}

		/* print the new Array */
		System.out.print("Reverse Array : ");
		for(int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
