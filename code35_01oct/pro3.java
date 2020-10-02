
import java.io.*;
import java.util.*;

class ArrayMax {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[Integer.parseInt(br.readLine())];	
		String input = br.readLine();

		StringTokenizer st = new StringTokenizer(input," ");

		for(int i = 0;i < arr.length;i++) {

			arr[i] = Integer.parseInt(st.nextToken().trim());
		}		

		int max = arr[0];
		for(int i = 0;i < arr.length;i++) {
	
			if(arr[i] > max)
				max = arr[i];
		}

		System.out.println("Maximum no : " + max);
	}
}
