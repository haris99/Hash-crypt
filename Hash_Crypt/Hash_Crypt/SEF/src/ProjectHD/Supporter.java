package ProjectHD;

public class Supporter extends User {
	private String userType;
	
	public Supporter (){
		super();
		userType = "supporter";
	}
	
	public Supporter (String userName, String ipAdress){
		super(userName, ipAdress);
		userType ="supporter";
	}
}
