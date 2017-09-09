import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {
	public String name;
	public ArrayList<Question> questions;

	public Quiz(String quizName){
		name = quizName;
		questions = new ArrayList<Question>();
	}

	public boolean add(int complexity, String question, String ... possibleAnswers){
		questions.add(new Question(question, possibleAnswers, complexity));
		return true;
	}

	public boolean add(String question, String ... possibleAnswers){
		questions.add(new Question(question, possibleAnswers));
		return true;
	}

	public void giveQuiz(int minComplexity, int maxComplexity){
		int questionNumber = 1;
		String userAnswer = "";
		int numCorrect = 0;
		Scanner in = new Scanner(System.in);

		System.out.println(name);

		for(Question currentQuestion : questions){
			if(currentQuestion.inComplexityRange(minComplexity, maxComplexity)){
				System.out.println("Question " + questionNumber);
				System.out.println(currentQuestion.getQuestion());

				userAnswer = in.nextLine();

				if(currentQuestion.answerCorrect(userAnswer)){
					System.out.println("Correct!");
					numCorrect++;
				}
				else{
					System.out.println("Wrong. The correct answer is " + currentQuestion.getAnswer());
				}

				questionNumber++;
			}
		}

		System.out.println("Quiz complete!");
		System.out.println("Your score: " + numCorrect + "/" + (questionNumber-1));

	}

	public void giveQuiz(){
		int questionNumber = 1;
		String userAnswer = "";
		int numCorrect = 0;
		Scanner in = new Scanner(System.in);

		System.out.println(name);

		for(Question currentQuestion : questions){

			System.out.println("Question " + questionNumber);
			System.out.println(currentQuestion.getQuestion());

			userAnswer = in.nextLine();

			if(currentQuestion.answerCorrect(userAnswer)){
				System.out.println("Correct!");
				numCorrect++;
			}
			else{
				System.out.println("Wrong. The correct answer is " + currentQuestion.getAnswer());
			}

			questionNumber++;

		}

		System.out.println("Quiz complete!");
		System.out.println("Your score: " + numCorrect + "/" + questions.size());

	}

}