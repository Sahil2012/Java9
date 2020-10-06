
import java.io.*;
import java.util.*;

class Multi {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* Accept the size of array*/
		System.out.print("Length of array : ");
		int[] array1 = new int[Integer.parseInt(br.readLine())];
		int[] array2 = new int[array1.length];
		int[] array3 = new int[array1.length];

		/* Accept the values in array1 */
		System.out.print("Enter Elements in array1 : ");
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < array1.length; i++) {
	
			array1[i] = Integer.parseInt(st1.nextToken());
		}

		/* Accept the values in array2 */
		System.out.print("Enter Elements in array2 : ");
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < array1.length; i++) {
	
			array2[i] = Integer.parseInt(st2.nextToken());
		}

		/* Operating on elements of array1 and array2 and storing result in array3 */
		for(int i = 0; i < array3.length; i++) {

			array3[i] = array1[i] * array2[i];
		}

		/* Printing the array3 */
		System.out.print("After Operation the array is : ");
		for(int i = 0; i < array3.length; i++) {

			System.out.print(array3[i] + " ");
		}
		System.out.println();
	}
}
