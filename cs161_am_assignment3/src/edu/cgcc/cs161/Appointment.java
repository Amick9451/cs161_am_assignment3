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
