//HEADER
//Program Name: Assignment3_ClinicMain
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Exemplifies getters/setters for individual classes


//PSEUDOCODE
//Program Start
//Declare main method
//assign client to c
// print default first name
//set first name to Andrew
//print out new first name
//
//assign referral class to r
//print out default provider name
//set provider name to Spaceship Healthcare
//print out new provider
//
//assign Referral list to m
//print default location
//set new location to OuterSpace
//print out new location
//
//assign Survey_Questions to q
//print out default Question Number
//Assign new question number to value 222
//print new question number
//
//assign Survey to s
//print out default survey number using accessor
//assign new survey number
//print out new survey number
//
//assign Service_Need to n
//print default ServiceNeedDescription
//assign new Service Need Description
//print new service need description
//
//assign clinic Service to y variable
//print out Service name
//assign new service name
//print out new service name
//
//assign appointment to variable a
//print default date
//set new date
//print new date
//Program End

package edu.cgcc.cs161;

public class ClinicMain {

	public static void main(String[] args) {
		
		Client c = new Client();
		System.out.println(c.getFirstName());
		c.setName("Andrew");
		System.out.println(c.getFirstName());
		
		Referral r = new Referral();
		System.out.println(r.getproviderName());
		r.setproviderName("Spaceship Healthcare");
		System.out.println(r.getproviderName());
		
		Referral_List m = new Referral_List();
		System.out.println(m.getLocation());
		m.setlocation("OuterSpace");
		System.out.println(m.getLocation());
		
		Survey_Questions q = new Survey_Questions();
		System.out.println(q.getQuestionNumber());
		q.setQuestionNumber(222);
		System.out.println(q.getQuestionNumber());
		
		Survey s = new Survey();
		System.out.println(s.getSurveyNumber());
		s.setSurveyNumber(44);
		System.out.println(s.getSurveyNumber());
		
		Service_Need n = new Service_Need();
		System.out.println(n.getServiceNeedDescription());
		n.setServiceNeedDescription("Prescription Refill");
		System.out.println(n.getServiceNeedDescription());
		
		Clinic_Service y = new Clinic_Service();
		System.out.println(y.getServiceName());
		y.setServiceName("Check up");
		System.out.println(y.getServiceName());
		
		Appointment a = new Appointment();
		System.out.println(a.getDate());
		a.setDate("1/24/21");
		System.out.println(a.getDate());
		
		
}
}

//FOOTER
//Alexandra
//Andrew
//Vancouver Clinic
//Spaceship Healthcare
//Carson
//OuterSpace
//1
//222
//22
//44
//Requires Surgerical Referral
//Prescription Refill
//Referral
//Check up
//1/21/21
//1/24/21
