
import java.io.*;
import java.util.*;

class ArraySum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[Integer.parseInt(br.readLine())];	
		String input = br.readLine();
		int sum = 0;
		StringTokenizer st = new StringTokenizer(input," ");

		for(int i = 0;i < arr.length;i++) {

			arr[i] = Integer.parseInt(st.nextToken().trim());
			sum += arr[i];
		}		

		System.out.println("Sum : " + sum);
	}
}
