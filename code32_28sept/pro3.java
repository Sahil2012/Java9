
import java.util.*;

class Email {

	public static void main(String[] args) {

		/* Making a object of Scanner Class */
		Scanner scan = new Scanner(System.in);

		/* Take the input using Scanner Class Object */
		System.out.print("Enter String ID : ");
		String id1 = scan.next();
		System.out.print("Enter Numerical ID : ");
		int id2 = scan.nextInt();

		System.out.println("Your Email Id is : " + id1 + id2 + "@gmail.com");
	}
}
