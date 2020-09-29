
class Toggle {

	public static void main(String[] args) {

		char[] arr = {'A','B','C','D'};

		for(int i = 0;i < arr.length; i++) {

			if(arr[i] >= 'A' && arr[i] <= 'Z') 
				System.out.println((char)(((int)arr[i]) + 32));
			else 
				System.out.println(arr[i]);
		
		}
	}
}
