//HEADER
//Program Name: Assignment3_Service_Need
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Service_Need class for ClinicMain based off of use case diagram. Framework only. 

//PSUEDOCODE
//Program Start
//create ServiceNeedDescriptionAttribute
//create constructor
//assign ServiceNeedDescription to "Requires surgerical referral"
//create identifyneed method
//assign it to return Referral required
//create MakeAppointment method
//assign it to return available dates
//create MakeReferral method
//assign it to make an auto generated referral
//create getServiceNeedDescription accessor
//assign it to return ServiceNeedDescription
//create setServiceNeedDescripton setter
//assign variable p to ServiceNeedDescription
//End Program

package edu.cgcc.cs161;

public class Service_Need extends ClinicMain {

	//fields(attributes)
	private String ServiceNeedDescription;
	//Constructor
	Service_Need() {
		ServiceNeedDescription = "Requires Surgerical Referral";
	}
	//operations
	public String identifyNeed() {
		return "Referral required";
	}
	public String MakeAppointment() {
		return "Available dates"; 
	}
	public String MakeReferral() {
		return "Auto generated referral";
	}
	
	public String getServiceNeedDescription() {
		return ServiceNeedDescription;
	}
	
	public void setServiceNeedDescription(String p) {
		ServiceNeedDescription = p;
	}
}
//FOOTER
//N/A