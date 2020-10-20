
import java.io.*;
import java.util.*;

class FindIndex {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size : ");
		int[] arr = new int[Integer.parseInt(br.readLine().trim())];

		System.out.print("Enter the elements : ");
		StringTokenizer st = new StringTokenizer(br.readLine().trim());

		/* Accept the elements in array */
		for(int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken().trim());
		}

		System.out.print("Eneter the Number : ");
		int f = Integer.parseInt(br.readLine().trim());

		int x = -1;
		for(int i = 0; i < arr.length; i++) {

			if(arr[i] == f) {

				x = i;
				break;
			}
		}
		if(x == -1)
			System.out.println(f + " is not available in array");
		else
			System.out.println(x);
	}
}
