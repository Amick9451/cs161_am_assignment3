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
