
import java.io.*;
import java.util.*;

class Reverse {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* Accept the size of array*/
		System.out.print("Length of array : ");
		int[] array1 = new int[Integer.parseInt(br.readLine())];

		/* Accept the values in array1 */
		System.out.print("Enter Elements in array : ");
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < array1.length; i++) {
	
			array1[i] = Integer.parseInt(st1.nextToken());
		}

		/* REVERSING THE ARRAY */
		for(int i = 0; i < array1.length / 2; i++) {
	
			array1[i] += array1[array1.length - i - 1];
			array1[array1.length - i - 1] = array1[i] - array1[array1.length - i -1];
			array1[i] -= array1[array1.length - i - 1];
		}

		System.out.print("Final Array : ");
		for(int i = 0; i < array1.length; i++) {

			System.out.print(array1[i] + " ");
		}
		System.out.println();
	}
}
