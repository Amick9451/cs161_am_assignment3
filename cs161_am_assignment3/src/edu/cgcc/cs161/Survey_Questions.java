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
