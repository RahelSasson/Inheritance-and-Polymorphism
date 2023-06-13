public class PassFailExam extends GradedActivity{
    private final int minimumPassingScore = 70;
    private final int totalQuestions = 10;
    private int questionsCorrect;

    public PassFailExam(int questionsCorrect) {
        super();
        setQuestionsCorrect(questionsCorrect);
       super.setScore(this.questionsCorrect*10);
    }

    public void setQuestionsCorrect(int questionsCorrect) {
        if(questionsCorrect <= totalQuestions)
            this.questionsCorrect = questionsCorrect;
        else
            System.out.println("you entered an invalid number, exam questions cannot exceed 10");
        return;
    }

    public int getQuestionsCorrect() {
        return questionsCorrect;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getMinimumPassingScore() {
        return minimumPassingScore;
    }

    @Override
    public char getGrade(){
        char letterGrade;

        if (super.getScore() >= 70)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
