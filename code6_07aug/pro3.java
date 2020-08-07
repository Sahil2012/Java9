
class Div {

	public static void main(String... args) {

		int i = 1;

		while(true) {

			if(i % 7 == 0 && i % 32 == 0) {
				System.out.println(i);
				if(i % 6 == 0)
					break;
			}
			
			i++;
		}
	}
}
