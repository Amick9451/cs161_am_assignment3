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
