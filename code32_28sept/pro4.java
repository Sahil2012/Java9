
import java.io.*;

class AreaPeri {

	public static void main(String[] args) throws IOException{

		/* Making a object of BufferedReader Class */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/* Accept the side of square from user */
		int side = Integer.parseInt(br.readLine());

		br.close();

		System.out.println("Area : " + (side * side) + "\nPerimeter : " + (4 * side));
	}
}
