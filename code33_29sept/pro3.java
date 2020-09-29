
class Avg {

	public static void main(String[] args) {

		float[] val = {10.5f,20.5f,15.5f,30.5f,18.5f};

		float sum = 0;

		for(int i = 0; i < val.length;i++){
		
			sum += val[i];
		}

		System.out.println("Average : "+(sum / (val.length)));
	}
}
