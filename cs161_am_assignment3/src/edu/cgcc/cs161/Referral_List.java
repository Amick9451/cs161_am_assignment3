package edu.cgcc.cs161;

public class Referral_List extends ClinicMain {
	
	//fields(attributes)
	private String providerName;
	private String location;
	private String phone;
	private String serviceProvided;
	
	//Constructor
	Referral_List() {
		providerName = "SeaMar";
		location = "Carson";
		phone = "9712034343";
		serviceProvided = "Refferal";
		
	}
	//operations
	public String matchServiceNeeds() {
		return "";
	}
	
	public String displayMatchedList() {
		return "";
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setlocation(String l) {
		location = l;
	}

}
