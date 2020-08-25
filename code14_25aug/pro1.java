
import java.io.*;

class UserInput {

	public static void main(String... args) throws Exception{

		int intVal;

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		//Accepting an value from user
		intVal = Integer.parseInt(br.readLine());

		System.out.println(intVal);	
	}
}
