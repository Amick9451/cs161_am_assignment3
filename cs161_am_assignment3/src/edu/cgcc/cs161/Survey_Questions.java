//HEADER
//Program Name: Assignment3_Survey_Questions
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/24/2021
//Description: Survey_ Questions class for ClinicMain based off of use case diagram. Framework only. 

//PSEUDOCODE
//Program Start
//create QuestionNumber attribute
//create Question attribute
//create constructor
//assign QuestionNumber to 1
//assign Question to String
//create getQuestionNumber accessor
//assign it to return QuestionNumber
//create setQuestionNumber setter
//assign QuestionNumber = i
//END PROGRAM
package edu.cgcc.cs161;

public class Survey_Questions extends ClinicMain {

	//fields(attributes)
	private int QuestionNumber;
	private String Question;
	
	//Constructor
	Survey_Questions() {
		QuestionNumber = 1;
		Question = "How did we do today on a scale from 1 to 10";
	}
	
	//operations
	public int getQuestionNumber() {
		return QuestionNumber;
	}
	
	public void setQuestionNumber(int i) {
		QuestionNumber = i;
	}
}
//FOOTER
//N/A