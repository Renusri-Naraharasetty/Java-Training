public class RecursionDemo {
	public static void main(String[] args) {
		display(1);
	}
	public static void display(int count) {
		if(count>100) 
			return;
		System.out.println(count);
		display(count+1);
	}

}
