//HEADER
//Program Name: Assignment3_Referral
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description:Referral class that extends Clinic Main. Based off of use-case diagram

//PSEUDOCODE
//Program Start
//create providerName attributes
//create date attributes
//create time attribute
//create constructor 
//assign providerName to Vancouver Clinic
//assign date to 1/23/21
//assign time to "12:11"
//create getproviderName getter
//assign it to return providerName
//create setproviderName setter
// assign providerName to variable p
//END PROGRAM

package edu.cgcc.cs161;

public class Referral extends ClinicMain{

	//fields(attributes)
	
	private String providerName;
	private String date;
	private String time;
	
	//Constructor
	Referral() {
		providerName = "Vancouver Clinic";
		date = "1/23/21";
		time = "12:11";
	}
	//operations
	
	public String getproviderName() {  //getter
		return providerName;
	}
	
	public void setproviderName(String p) {
		providerName = p;
	}
}
//FOOTER
//N/A