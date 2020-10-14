
import java.io.*;
import java.util.*;

class Missing {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[Integer.parseInt(br.readLine())];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}		

		int var = arr[0];

		for(int i = 0; i < arr.length; i++) {

			if(var == arr[i]) {

				var ++;
			} else {

				System.out.print(var + " ");
				var ++;
				i--;
			}
		}
		System.out.println();
	}
}
