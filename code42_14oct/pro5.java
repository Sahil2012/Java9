
import java.io.*;
import java.util.*;

class Mono {

	static boolean checkMonotonic(int[] arr) {

		int x = 1, y = 1;

		for(int i = 0; i < arr.length - 1; i++) {

			if(arr[i] < arr[i + 1])
				x = 0;
			if(arr[i] > arr[i + 1])
				y = 0;
		}

		if(x == 1 || y == 1)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input Size : ");
		int[] arr = new int[Integer.parseInt(br.readLine())];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}				

		System.out.println(checkMonotonic(arr));
	}
}
