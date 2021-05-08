package encapsulation;

public class PrivateClass 
{ 	/** In encapsulation data members should be Private 
		private variables we cannot access another classes it will be access with in a class method only
		We can create a methods as a public getter and setter methods by using we can change the data members
 	**/
	private String name;  
	private int schoolFee;
	private String userName;
	private String possoword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSchoolFee() {
		return schoolFee;
	}
	public void setSchoolFee(int schoolFee) {
		this.schoolFee = schoolFee;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPossoword() {
		return possoword;
	}
	public void setPossoword(String possoword) {
		this.possoword = possoword;
	}

}
