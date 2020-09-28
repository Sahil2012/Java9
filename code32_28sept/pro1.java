
import java.util.*;

class UserInput {

	public static void main(String[] args) {

		/* Making a object of Scanner Class */
		Scanner scan = new Scanner(System.in);

		/* Accepting the input from user */
		String name = scan.next();
		int roll = scan.nextInt();
		String intrest = scan.next();

		System.out.println("Hey,my name is " + name + " and my roll number is " + roll + ". My field of intrests are " + intrest);
	}
}
