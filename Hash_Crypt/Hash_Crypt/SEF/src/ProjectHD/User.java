package ProjectHD;

abstract public class User {
	protected String userName;
	protected String ipAdress;
	
	
public User(){
	userName = null;
	ipAdress = null;
}

public User(String userName, String ipAdress){
	//add check code
	this.userName = userName;
	this.ipAdress = ipAdress;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getIpAdress() {
	return ipAdress;
}

public void setIpAdress(String ipAdress) {
	this.ipAdress = ipAdress;
}


}
