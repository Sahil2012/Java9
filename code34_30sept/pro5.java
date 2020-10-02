
import java.io.*;
import java.util.*;

class NumVar {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int cEven = 0,cOdd = 0,cZ = 0,cP = 0,cN = 0;
		for(int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken().trim());

			if(arr[i] % 2 == 0)
				cEven += 1;
			else 
				cOdd += 1;

			if(arr[i] == 0)
				cZ += 1;
			else if(arr[i] > 0)
				cP += 1;
			else 
				cN += 1;
		}

		System.out.println("No of Positive No : " + cP);
		System.out.println("No of Negative No : " + cN);
		System.out.println("No of Even No : " + cEven);
		System.out.println("No of Odd No : " + cOdd);
		System.out.println("No of Zeros : " + cZ);
	}
}
