//********************************************************************
//  Question.java        Author: Lewis/Loftus //
//  Represents a question (and its answer).
//********************************************************************

public class Question {
	private String question;
	private String[] possibleAnswers;
	private int complexityLevel;

	public Question (String question, String[] possibleAnswers, int complexity){
		this.question = question;
		this.possibleAnswers = possibleAnswers;
		complexityLevel = complexity;
	}

	//----------------------------------------------------------------
	//  Constructor: Sets up the question with a default complexity.
	//----------------------------------------------------------------
	public Question (String question, String[] possibleAnswers){
		this.question = question;
		this.possibleAnswers = possibleAnswers;
		complexityLevel = 1;
	}

   	//----------------------------------------------------------------
   	//  Sets the complexity level for this question.
   	//----------------------------------------------------------------
	public void setComplexity (int level){
		complexityLevel = level;
	}

   	//----------------------------------------------------------------
   	//  Returns the complexity level for this question.
   	//----------------------------------------------------------------
   	public int getComplexity(){
   		return complexityLevel;
   	}

 	//----------------------------------------------------------------
 	//  Returns the question.
 	//----------------------------------------------------------------
 	public String getQuestion(){
 		return question;
 	}

 	//----------------------------------------------------------------
 	//  Returns the answer to this question.
 	//----------------------------------------------------------------
 	public String getAnswer(){
 		return possibleAnswers[0];
 	}

   	//----------------------------------------------------------------
   	//  Returns true if the candidate answer matches the answer.
   	//----------------------------------------------------------------
   	public boolean answerCorrect (String candidateAnswer){
   		for(String possibleAnswer : possibleAnswers){
   			if(possibleAnswer.equalsIgnoreCase(candidateAnswer)){
   				return true;
   			}
   		}

   		return false;
   	}

   	//----------------------------------------------------------------
   	//  Returns this question (and its answer) as a string.
   	//----------------------------------------------------------------
   	public String toString(){
   		return question + "\n" + possibleAnswers[0];
   	}

   	public boolean inComplexityRange(int min, int max){
   		return (complexityLevel>= min && complexityLevel <= max);
   	}
}
