public class TeamMates{
	private String userid;
	private String name;
	private boolean online;
	
	public TeamMates(String name, String userid, boolean online){
		this.userid = userid;
		this.name = name;
		this.online = online;
	}
	
	public TeamMates(){
		this.userid = "userid";
		this.name = "name";
		this.online = false;
	}
	
	public TeamMates(String name, String userid){
		this.userid = userid;
		this.name = name;
		this.online = false;
	}
	
	public String getuserid(){
		return this.userid;
	}
	
	public void setuserid(String userid){
		this.userid = userid;
	}
	
	public String getname(){
		return this.name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public boolean getonline(){
		return this.online;
	}
	
	public void setonline(boolean online){
		this.online = online;
	}
}
