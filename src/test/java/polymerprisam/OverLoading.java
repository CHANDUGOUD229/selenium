package polymerprisam;

public class OverLoading 
{
	
	public int name(int a)
	{
	return a;
	}
	public String name(String school)
	{
		return school;
	}
	public int name(int b,int c)
	{
		return b+c;
		
	}
	public int name(int r,int e,int s)
	{
		return r*e*s;	
	}
	public String name(String name,int s)
	{
		return name+s;
	}
	public String name(String move,String obj)
	{
		return move+" "+obj;
	}

}
