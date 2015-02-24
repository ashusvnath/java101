public class Calculator {
	
	private int instance_last_value;
	public static int last_value;
	
	public static int static_add(int a, int b) {
		last_value += (a + b);
		return last_value;
	}

	public int add(int a, int b){
		last_value += (instance_last_value = a + b);
		return instance_last_value;
	}

	public void showInstanceLastValue() {
		System.out.println("Instance:" + instance_last_value);
	}

	public static void showLastValue() {
		System.out.println("static:" + last_value);
	}
}