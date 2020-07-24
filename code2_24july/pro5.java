
class Exam {

	boolean isEligible(int x) {
	
		if(x >= 75) {

			return true;
		} else {
	
			return false;
		}
	}

	public static void main(String[] args) {

		int atten = 75;

		Exam col = new Exam();

		boolean eli = col.isEligible(atten);

		System.out.println("Student's attendence is " + atten);
		System.out.println("Processing....");

		if(eli == true) {

			System.out.println("Student is eligible for the exam.");
		} else {

			System.out.println("Student is not eligible for the exam.");
		}
	}
}
