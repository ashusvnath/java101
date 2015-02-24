public class HelloWorld {
	public static void main(String[] args) {
		HelloWorld h=new HelloWorld();
		h.main(null);
		Calculator kratisCalc = new Calculator();
		Calculator poojasCalc = new Calculator();

		System.out.println(kratisCalc.add(4, 5)); 
		kratisCalc.showInstanceLastValue();
		kratisCalc.static_add(1,2);
		Calculator.showLastValue();

		System.out.println(poojasCalc.add(20, 3));
		poojasCalc.static_add(1,2); 
		poojasCalc.showInstanceLastValue();
		Calculator.showLastValue();

		System.out.println(Calculator.static_add(10, 20));
		Calculator.showLastValue();
		System.out.println("Last Value:" + Calculator.last_value);
		//struct something *p = malloc(sizeof(struct someting));
	}
}