public class FinalExam extends GradedActivity{
    private int numberOfQuestions;
    private double pointsPerQuestion;
    private int questionsCorrect;

    public FinalExam(int numberOfQuestions, int questionsCorrect) {
        super();
        this.numberOfQuestions = numberOfQuestions;
        this.pointsPerQuestion = 100/this.numberOfQuestions;
        this.questionsCorrect = questionsCorrect;
        this.setScore();
    }

    public void setScore() {
        if(questionsCorrect <= numberOfQuestions)
            super.setScore(pointsPerQuestion*questionsCorrect);
        else
            System.out.println("Invalid entry, questions correct cannot exceed total questions");
        return;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public double getPointsPerQuestion() {
        return pointsPerQuestion;
    }

    public int getQuestionsCorrect() {
        return questionsCorrect;
    }


}
