
class RefCheck {

	public static void main(String[] args) {

		String s1 = new String("Sahil");
		String s2 = "Sahil";
		String s3 = "Sahil";

		System.out.println("s1 and s2 looks at " + ((s1 == s2) ? "same location":"different location"));
		System.out.println("s2 and s3 looks at " + ((s3 == s2) ? "same location":"different location"));
	}
}
