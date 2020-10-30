
import java.io.*;

class LenCap {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(br.readLine());

		/*
		 * The length() method in StringBuffer return the actual length of string
		 * and the capacity() method return the capacity of caharacter that string can store
		 */

		/* For string sb1 length and capacity */
		System.out.println("Length of Sb1 : " + sb1.length());
		System.out.println("Capacity of Sb1 : " + sb1.capacity());

		/* For string sb2 length and capacity */
		System.out.println("Length of Sb2 : " + sb2.length());
		System.out.println("Capacity of Sb2 : " + sb2.capacity());

	}
}
