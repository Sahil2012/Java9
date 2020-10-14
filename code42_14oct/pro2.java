
import java.io.*;
import java.util.*;

class OddTime {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0; i < arr.length; i++) {
	
			int count = 0;

			for(int j = 0; j < arr.length; j++) {

				if(arr[i] == arr[j])
					count ++;
			}
			if(count % 2 == 1) {

				System.out.println(arr[i]);
				break;
			}
		}	
	}
}
