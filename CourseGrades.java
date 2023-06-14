//BS'D
/*
In a course, a teacher gives the following tests and assignments:
•	 A lab activity that is observed by the teacher and assigned a numeric score.
•	 A pass/fail exam that has 10 questions. The minimum passing score is 70.
•	 An essay that is assigned a numeric score.
•	 A final exam that has 50 questions.
Write a class named CourseGrades. The class should have a GradedActivity array named
grades as a field. The array should have four elements, one for each of the assignments
previously described. The class should have the following methods:
**setLab:
This method should accept a GradedActivity object as its argument. This object should already hold the student’s score for the lab
activity. Element 0 of the grades field should reference this object.
**setPassFailExam:
This method should accept a PassFailExam object as its argument.
This object should already hold the student’s score for the pass/fail
exam. Element 1 of the grades field should reference this object.
**setEssay:
This method should accept an Essay object as its argument. (See
Programming Challenge 4 for the Essay class. If you have not
completed Programming Challenge 4, use a GradedActivity object
instead.) This object should already hold the student’s score for
the essay. Element 2 of the grades field should reference this
object.
**setFinalExam:
This method should accept a FinalExam object as its argument.
This object should already hold the student’s score for the final
exam. Element 3 of the grades field should reference this object.
toString: This method should return a string that contains the numeric
scores and grades for each element in the grades array.
 */
public class CourseGrades extends GradedActivity implements Analyzable {
    private final GradedActivity[] studentGrades = new GradedActivity[4];

    public CourseGrades(GradedActivity lab, GradedActivity exam, GradedActivity essay, GradedActivity finalExam){
        this.setLab(lab);
        this.setPassFailexam(exam);
        this.setEssay(essay);
        this.setFinalExam(finalExam);
        setCourseScore();

    }

    public void setLab(GradedActivity lab) {
        studentGrades[0] = lab;
    }

    public void setPassFailexam(GradedActivity exam){
        studentGrades[1] = exam;
    }

    public void setEssay(GradedActivity essay) {
        studentGrades[2] = essay;
    }

    public void setFinalExam(GradedActivity finalExam) {
        studentGrades[3] = finalExam;
    }

    public void setCourseScore() {
        double total = 0;
        for(int i = 0; i < studentGrades.length; i++)
            total += studentGrades[i].getScore();

        super.setScore(total/4);
    }

    public GradedActivity getLab() {
        return studentGrades[0];
    }

    public GradedActivity getPassFailExam(){
        return studentGrades[1];
    }

    public GradedActivity getEssay() {
        return studentGrades[2];
    }

    public GradedActivity getFinalExam( ) {
        return studentGrades[3];
    }

    public String toString() {
        return "Lab Score: " + studentGrades[0].getScore() + " Grade: " + studentGrades[0].getGrade() + "\n" +
                "Exam Score: " + studentGrades[1].getScore() + " Grade: " + studentGrades[1].getGrade() + "\n" +
                "Essay Score: " + studentGrades[2].getScore() + " Grade: " + studentGrades[2].getGrade() + "\n" +
                "Final Exam Score: " + studentGrades[3].getScore() + " Grade: " + studentGrades[3].getGrade();
    }

    @Override
    public double getAverage() {
        double total = 0;
        for(int i = 0; i < studentGrades.length; i++)
            total += studentGrades[i].getScore();
        return total/4;
    }

    public GradedActivity getHighest() {
        double highest = studentGrades[0].getScore();
        GradedActivity obj = studentGrades[0];
        for(int i = 1; i < studentGrades.length; i++) {
            if(highest < studentGrades[i].getScore()) {
                highest = studentGrades[i].getScore();
                obj = studentGrades[i];
            }
        }
        return obj;
    }

    public GradedActivity getLowest() {
        double lowest = studentGrades[0].getScore();
        GradedActivity obj = studentGrades[0];
        for(int i = 1; i < studentGrades.length; i++) {
            if(lowest > studentGrades[i].getScore()) {
                lowest = studentGrades[i].getScore();
                obj = studentGrades[i];
            }
        }
        return obj;
    }

}
