
import java.io.*;

class Kinetic {

	public static void main(String[] args) throws Exception {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		float mass,velo,kE;

		mass = Float.parseFloat(br.readLine());
		velo = Float.parseFloat(br.readLine());

		kE = (mass*velo*velo)/2;
		
		System.out.println("Kinetic Energy of the Object : " + kE);
	}
}
