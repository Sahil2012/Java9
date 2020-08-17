
class Greater {

	public static void main(String... args) {

		int a = 2,b = 4,c = 5;

		if(a == b && b == c) {

			System.out.println("All three are equal");
		} else if(a >= b && a >= c) {

			System.out.println(a + " is the greatest");
		} else if(b >= a && b >= c) {

			System.out.println(b + " is the greatest");
		} else if(c >= a && c >= b){

			System.out.println(c + " is the greatest");
		}
	}
}
