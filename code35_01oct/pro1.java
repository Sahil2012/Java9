
import java.io.*;
import java.util.*;

class ArrayReverse {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[Integer.parseInt(br.readLine())];	
		String input = br.readLine();

		StringTokenizer st = new StringTokenizer(input," ");

		for(int i = 0;i < arr.length;i++) {

			arr[i] = Integer.parseInt(st.nextToken().trim());
		}		

		System.out.println("Array in reverse : ");
		for(int i = 0;i < arr.length;i++) {
	
			System.out.println(arr[arr.length - i - 1]);
		}
	}
}
