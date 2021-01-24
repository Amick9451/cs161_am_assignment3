//HEADER
//Program Name: Assignment3_Survey_Questions
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Appointment class for ClinicMain based off of use case diagram. Framework only. 

//PSUEDOCODE
//Program Start
//Set up date attribute
//set up time attribute
//create constructor
//assign date to string "1/21/21"
//assign time to string "1:35"
//create getdate accessor
//assign function return date
//create setdate setter
//assign date to a 
//End Program

package edu.cgcc.cs161;

public class Appointment extends ClinicMain {

	//fields(attributes)
	private String date;
	private String Time;
	//Constructor
	Appointment() {
		date = "1/21/21";
		Time = "1:35";
	}
	//operations
	public String getDate() {
		return date;
	}
	
	public void setDate(String a) {
		date=a;
	}
}
//FOOTER
//N/A