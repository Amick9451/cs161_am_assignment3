//HEADER
//Program Name: Assignment3_Referral_List
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Referral_List class containing attributes, constructors, and operations based on use case diagram provided

//PSEUDOCODE
//Program Start
//create providerName attribute
//create location attribute
//create phone attribute
//create serviceProvided attribute
//create constructor
//assign providerName to SeaMar
//assign location to Carson
//assign phone to 9712034343
//assign serviceProvided to Referral
//create matchServiceNeeds Method
//create displayMatchedList method
//create getLocation getter
//assign it to return location
//create setlocation setter
//assign it to location = l
//END PROGRAM

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
		serviceProvided = "Referral";
		
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
//FOOTER
//N/A