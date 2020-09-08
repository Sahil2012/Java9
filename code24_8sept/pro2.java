
import java.io.*;

class Convert {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		float rupee,dollar;

		//Accept the rupees in rupee
		rupee = Float.parseFloat(br.readLine());

		//Convert the rupee into dollar
		System.out.println((rupee >= 0) ? ("In dollar : " + (rupee/75)) : "Invalid Input");
	}
}
