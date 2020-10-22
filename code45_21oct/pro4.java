
class EqualString {

	public static void main(String... args) {

		String s1 = new String("Sahil");
		String s2 = new String("Sahil");
		String s3 = new String("sahil");

		System.out.println("s1 and s2 are " + ((s1.equals(s2) ? " equal" : " not equal")));
		System.out.println("s1 and s3 are " + ((s1.equals(s3) ? " equal" : " not equal")));
	}
}
