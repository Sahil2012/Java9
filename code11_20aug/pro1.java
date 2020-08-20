
class Pythagorus {

	public static void main(String... args) {

		//Take sides of traingle in side1,side2 and hypo
		int side1 = 3,side2 = 4,hypo = 5;

		//Check for the condition of pythagorous theorem
		if(hypo*hypo == side1*side1 + side2*side2) {

			System.out.println("Triangle Satisfies the Pythagorean Theorem");
		} else {

			System.out.println("Triangle does not Satisfies Pythagorean Theorem");
		}
	}
}
