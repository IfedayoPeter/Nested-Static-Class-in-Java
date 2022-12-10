package staticnestedclass;

class OuterClass {

	static int staticvalue = 10;
	int value = 20;
	private static int privatestaticvalue = 30;

	static class StaticNestedclass {
		void display() {
			System.out.println("outer static value is " + staticvalue);
			System.out.println("outer private static value is " + privatestaticvalue);
//				a static class cannot access a non static object but a normal class can access a static object
//				System.out.println("outer int value is "+ value);
		}
	}

}
