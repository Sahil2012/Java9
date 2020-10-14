
import java.io.*;
import java.util.*;

class Pattern {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = new String[Integer.parseInt(br.readLine())];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for(int i = 0; i < arr.length; i++) {

			arr[i] = st.nextToken();
		}

		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j < i+1; j++) {

				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
