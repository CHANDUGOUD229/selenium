package encapsulation;

public class MainClass 
{
	
	public static void main(String[] args) {
		PrivateClass p=new PrivateClass();
		p.setName("chirra chandra shekhar");
		p.setSchoolFee(3500);
		p.setUserName("chirra_chandu");
		p.setPossoword("chandu@123");
		System.out.println(p.getName());
		System.out.println(p.getSchoolFee());
		System.out.println(p.getUserName());
		System.out.println(p.getPossoword());
	}

}
