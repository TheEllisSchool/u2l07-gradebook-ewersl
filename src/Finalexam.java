
public class Finalexam extends GradedActivity  {
	// attributes
	private int numQuestions; 
	private double pointsEach; 
	private int numMissed;
	
	//methods
	public Finalexam(int questions, int missed) {
		setNumQuestionsandPoints(questions); 
		setNumMissed(missed);
		
		double s = (numQuestions- numMissed) * pointsEach; 
		setScore(s);
	 
	}
	public void setNumQuestionsandPoints(int q) { 
		if (q > 0) {
			numQuestions= q; 
			pointsEach= 100/ numQuestions; 
		} else {
			System.out.println("Num of Questions must be positive, default to 50 questiobs");
		}
	}
	public void setNumMissed (int m) {
		if (m >= 0 && m<= numQuestions ) {
			numMissed = m;
		} else {
			numMissed = 0; 
			System.out.println("Num missed must be between 0 and num of questions, default to no missed");
		}
		}
	
	
	public double getPointsEach() {
		return pointsEach;
	} 
	public int getNumMissed () {
		return numMissed; 
	}
	public int getNumQuestions () {
		return numQuestions; 
	}
		
		
	// +Final Exam (int questions, int missed)
	
	//- numOuestions: int 
	//- pointsEach: double
}
