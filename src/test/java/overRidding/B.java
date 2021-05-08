package overRidding;

public class B extends A {

	public void sum(int a, int b) {
		System.out.println("child class sum");
		System.out.println(a * a + b * b);

	}

	public int sub(int a, int b) {
		System.out.println("child class sub");
		return a - b;
	}

}
