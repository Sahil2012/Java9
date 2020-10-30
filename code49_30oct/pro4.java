
class TestMethods {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Healthy");

		System.out.println(sb);

		sb.insert(4," ");

		System.out.println(sb);

		sb.insert(8,"Self");

		System.out.println(sb);

		sb.deleteCharAt(4);

		System.out.println(sb);
	}
}
