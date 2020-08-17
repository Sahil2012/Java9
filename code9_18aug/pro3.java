
class SOA {

	public static void main(String... args) {

		char ch = '*';

		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			System.out.println(ch + " is alphabet");
		else if(ch >= 48 && ch <= 57)
			System.out.println(ch + " is a digit");
		else
			System.out.println(ch + " is a special Charecter");
	}
}
