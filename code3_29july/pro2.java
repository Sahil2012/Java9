
class Program2 {

	public static void main(String[] args) {

		char ch = 'b';

		if(ch >= 'A' && ch <= 'Z') {

			System.out.printf("%c\n",ch + 32);
		} else if(ch >= 'a' && ch <= 'z') {

			System.out.printf("%c\n",ch - 32);
		}
	}
}
