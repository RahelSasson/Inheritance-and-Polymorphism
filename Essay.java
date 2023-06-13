//BS'D
/*
Design an Essay class that extends the GradedActivity class presented in this chapter. The
Essay class should determine the grade a student receives for an essay. The student’s essay
score can be up to 100 and is determined in the following manner:
Grammar: 30 points
Spelling: 20 points
Correct length: 20 points
Content: 30 points
 */
public class Essay extends GradedActivity{

    private int grammarPoints ;
    private int spellingPoints ;
    private int lengthPoints ;
    private int contentPoints ;

    public Essay(int grammarPoints, int spellingPoints, int lengthPoints, int contentPoints) {
        super();
        this.grammarPoints = grammarPoints;
        this.spellingPoints =spellingPoints;
        this.lengthPoints = lengthPoints;
        this.contentPoints = contentPoints;
        setPoints();
    }

    public Essay() {
        super();
    }

    private boolean isValid() {
        if(grammarPoints <=30 && spellingPoints <=20 && lengthPoints <=20 && contentPoints <=30)
            return true;

        return false;
    }

    public void setPoints() {
        if(isValid() == true)
            super.setScore(this.grammarPoints + this.spellingPoints + this.lengthPoints + this.contentPoints);
        else
            System.out.println("Invalid input");
    }

    public void setGrammarPoints(int grammarPoints) {
            this.grammarPoints = grammarPoints;
    }

    public void setSpellingPoints(int spellingPoints) {
            this.spellingPoints = spellingPoints;
    }

    public void setLengthPoints(int lengthPoints) {
            this.lengthPoints = lengthPoints;
    }

    public void setContentPoints(int contentPoints) {
            this.contentPoints = contentPoints;
    }

    public int getGrammarPoints() {
        return grammarPoints;
    }

    public int getSpellingPoints() {
        return spellingPoints;
    }

    public int getLengthPoints() {
        return lengthPoints;
    }

    public int getContentPoints() {
        return contentPoints;
    }


}
