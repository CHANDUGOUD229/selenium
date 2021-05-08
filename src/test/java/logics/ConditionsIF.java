package logics;

public class ConditionsIF {

	public void getNumber(int data) 
	{
		if (data % 2 == 0) {
			System.out.println("This is Even Number" + data);
		} else {
			System.out.println("This is Odd number  :" + data);
		}
	}
	
	public void getAddOrEven(int data) 
	{
		if(data < 0)
		{
			System.out.println(" This is Nagative number");
		}else if (data == 0) 
		{
		System.out.println("Thsi is Zero number");	
		}else if (data>0)
		{
			System.out.println("This is Possitive Number");
			
		}else if (data%2==0)
		{
		 System.out.println("this is even number");	
		}

	}
	
	public void getAddOrEvens(int data) 
	{
		if(data%2 ==0 && data%5==0)
		{
			System.out.println("This is divisable");
		}else if(data%2 ==0 || data%5==0) 
		{
			System.out.println("it s Divisable");
		}

	}
	

	public static void main(String[] args)
	{
		ConditionsIF conditionsIF = new ConditionsIF();
		conditionsIF.getNumber(20);
		conditionsIF.getAddOrEvens(20);
	}

}
