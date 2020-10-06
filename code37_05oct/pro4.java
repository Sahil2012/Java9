
import java.io.*;
import java.util.*;

class AddEle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[Integer.parseInt(br.readLine()) + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < arr.length - 1; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.print("Enter Index : ");
		int n = Integer.parseInt(br.readLine());

		System.out.print("Enter Value : ");
		int v = Integer.parseInt(br.readLine());

		for(int i = arr.length - 1; i > n; i--) {

			arr[i] = arr[i - 1];
		}

		arr[n] = v;

		/*Print the array */
		for(int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
