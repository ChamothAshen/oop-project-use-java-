package eventmanege;

public class eventvenue {

private	String vid ;
private String venuecatagory;
private String venuename;
private	String venuelocation;
private	String venuecapacity; 

	public eventvenue(String vid, String venuecatagory, String venuename, String venuelocation, String venuecapacity) {
		
		this.vid = vid;
		this.venuecatagory = venuecatagory;
		this.venuename = venuename;
		this.venuelocation = venuelocation;
		this.venuecapacity = venuecapacity;
	}
	public String  getVid() {
		return vid;
	}
	
	public String getVenuecatagory() {
		return venuecatagory;
	}
	
	public String getVenuename() {
		return venuename;
	}
	
	public String getVenuelocation() {
		return venuelocation;
	}
	
	public String getVenuecapacity() {
		return venuecapacity;
	}
	
	
	
}
