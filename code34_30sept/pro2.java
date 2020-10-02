
import java.io.*;

class Index {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = {25,14,56,15,36,56,77,18,29,49};
		int x = -1,num = Integer.parseInt(br.readLine());

		for(int i = 0; i < arr.length; i++) {

			if(arr[i] == num) {
	
				x = i;
				break;
			}
		}

		if( x != -1)
			System.out.println("Index of " + num + " is : " + x);
		else 
			System.out.println("Array does not contain " + num);
	}
}
