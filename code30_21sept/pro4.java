
import java.io.*;

class Large {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		if(a == b && b == c) {

			System.out.println("All values are equal");
		} else if(a >= b && a >= c) {

			System.out.println(a + " is largest num among " + a + " "+b+" "+c);
		} else if(b >= a && b >= c) {
		
			System.out.println(b + " is largest num among " + a + " "+b+" "+c);
		} else {

			System.out.println(c + " is largest num among " + a + " "+b+" "+c);
		}
	}
}
