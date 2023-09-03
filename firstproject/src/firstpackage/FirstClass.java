package firstpackage;

public class FirstClass {
	int a;
	int b;
	public int sum() {
		int sum =a+b;
		return sum;
		
	}
	public int sub() {
		int sub=a-b;
		return sub;
		
	}

	public static void main(String[] args) {
		
		FirstClass test=new FirstClass();
		test.a=50;
		test.b=10;
		int c=test.sum();
		int d= test.sub();
		System.out.println("sum of the values:  "+c+  "   subtraction of the values:  "+d);
		

	}

}
