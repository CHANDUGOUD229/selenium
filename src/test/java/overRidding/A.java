package overRidding;

public class A {

	public void sum(int a, int b) {
		System.out.println("parent class sum");
		System.out.println(a * b);
	}

	public int sub(int a, int b) 
	{
		System.out.println("parent cls sub");
		return (a - b)*15;
	}

}
