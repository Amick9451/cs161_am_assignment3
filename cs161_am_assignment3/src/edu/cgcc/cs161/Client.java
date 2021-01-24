//HEADER
//Program Name: Assignment3_Client
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Client class for ClinicMain based off of use case diagram. Framework only. 

//PSEUDOCODE
//Program Start
//create FirstName attribute
//create LastName attribute
//create Street attribute
//create City attribute
//create State attribute
//create county attribute
//create ZipCode attribute
//create phone attribute
//create email attribute
//create InsuranceCarrier
//Create constructor
//assign Firstname to Alexandra
//assign LastName to Mick
//assign Street to Russells Timber Ln
//assign City to Carson
//assign State to WA
//assign Country to USA
//assign ZipCode to 98610
//assign phone to 9712043092
//assign email to amick9451@student.cgcc.edu
//assign InsuranceCarrier to Washington Apple Healthcare
//create getFirstName accessor
//assign it to return FirstName value
//create setName accessor
//assign FirstName to n
//End Program

package edu.cgcc.cs161;

public class Client extends ClinicMain {

	//fields(attributes)
	private String FirstName;
	private String LastName;
	private String Street;
	private String City;
	private String State;
	private String Country;
	private String ZipCode;
	private String Phone;
	private String Email;
	private String InsuranceCarrier;
	
	//Constructor
	Client() {
		FirstName = "Alexandra";
		LastName = "Mick";
		Street = "Russells Timber Ln";
		City = "Carson";
		State = "WA";
		Country = "USA";
		ZipCode = "98610";
		Phone = "9712043092";
		Email = "amick9451@student.cgcc.edu";
		InsuranceCarrier = "Washington Apple Healthcare";
		
	}
	//operations
	public String getFirstName() { //getter (accessor)
		return FirstName;
	}
	
	
	public void setName(String n) {  //setter (Modifier)
		FirstName = n;
	}
	
	
}
//FOOTER
//N/A