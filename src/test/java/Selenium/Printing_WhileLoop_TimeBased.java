package Selenium;

public class Printing_WhileLoop_TimeBased
{
	public static void main(String[] args) {
		long t= System.currentTimeMillis();
		long end = t+15000;
		while (System.currentTimeMillis() < end) 
		{
			System.err.println("chandra shekhar goud");
		}
	}

}
