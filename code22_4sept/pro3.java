
import java.io.*;

class Area {

	public static void main(String[] args) throws Exception{

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int len = Integer.parseInt(br.readLine());
		int breadth = Integer.parseInt(br.readLine());

		System.out.println("Area of Rectangle = " + (len * breadth));
		
	}
}
