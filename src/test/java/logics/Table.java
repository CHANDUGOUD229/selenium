package logics;



public class Table
{
	public Table(int a) 
	{
		for(int i=0;i<11;i++)
		{
			System.out.println(a  +"   *  " +i+"  =  "+a*i);
		}
		
		
	}
	public void TableRevars(int a) 
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(a  +"  *  " +i+"  =  "+a*i);
		}
		
		
	}
	
	
//	public void ded(int a)
//	{
//		int i=1;
//		while(i<10);
//		{
//			System.out.println( a+"  "+ " *   "+ i +"  =   "+ a*i);
//			i++;
//		}
//		System.out.println("Task is done");
//		
//	}
//	
//	
	public static void main(String[] args) 
	{
		Table s=new Table(22);
		System.out.println("Revarse order");
		s.TableRevars(22);
		System.out.println("");
		//s.ded(12);
	}

}
