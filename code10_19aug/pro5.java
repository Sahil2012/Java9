
class VAT {

	public static void main(String... args) {

		//taking three angles as input
		int angle1 = 30,angle2 = 60,angle3 = 90;

		//Checking if the the angles are of traingle
		if(angle1 + angle2 + angle3 == 180) {

			System.out.println("The triangle with angles " + angle1 + "," + angle2 + " and " + angle3 + " is a valid one");
		} else {

			System.out.println("The triangle is invalid");
		}
		
	}
}
