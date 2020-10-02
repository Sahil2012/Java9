
import java.io.*;
import java.util.*;

class TwoArray {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr1 = new int[Integer.parseInt(br.readLine())];
		int[] arr2 = new int[arr1.length];

		for(int i = 0; i < arr1.length; i ++) {

			System.out.print("Enter Elements : ");
			arr1[i] = Integer.parseInt(br.readLine());

			if(arr1[i] % 2 == 0)
				arr2[i] = -1;
		}

		for(int i = 0;i < arr1.length; i++) {

			System.out.println("ArrayOne[" + i +"] = " + arr1[i] + " & ArrayTwo["+i+"] = " + arr2[i]);
		}
	}
}
