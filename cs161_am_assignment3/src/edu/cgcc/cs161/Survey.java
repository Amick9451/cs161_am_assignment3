//HEADER
//Program Name: Assignment3_Survey_Questions
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Survey class for ClinicMain based off of use case diagram. Framework only. 

//PSEUDOCODE
//Start program
//create SurveyNumber attribute
//create QuestionSet attribute
//create AnswerSet
//create constructor 
//assign SurveyNumber to integer value 22
//Assign Question set to a set of questions
//assign answerSet to clinic patients answers
//create displayQuestion method
//assign it to show questions in order
//create recordAnswer method
//assign it to record input 
//create getSurveyNumber accessor
//assign it to return SurveyNumber value
//create setSurveyNumber setter
//assign it to SurveyNumber = b
//End Program

package edu.cgcc.cs161;

public class Survey extends ClinicMain {

	//fields(attributes)
	private int SurveyNumber;
	private String QuestionSet;
	private String AnswerSet;
	
	
	//Constructor
	Survey() {
		SurveyNumber = 22;
		QuestionSet = "A bunch of questions here or smth";
		AnswerSet = "Clinic Patient Answers Here";
	}
	//operations
	public String displayQuestion() {
		return "Question One: something something something";
	}
	public String recordAnswer() {
		return "Client Input Here";
	}
	
	public int getSurveyNumber() {
		return SurveyNumber;
	}
	
	public void setSurveyNumber(int b) {
		SurveyNumber = b;
	}
}
//FOOTER
//N/A