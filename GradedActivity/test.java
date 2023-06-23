//BS'D
/*
Testing CourGrades Class
 */
import java.text.ParseException;

public class test {
    public static void main(String[] args) throws ParseException {

        GradedActivity lab = new GradedActivity();
        double labScore = 90;
        lab.setScore(labScore);

        int questionsCorrectOnExam = 10;
        GradedActivity exam = new PassFailExam(questionsCorrectOnExam);

        int grammarPoints = 30;
        int spellingPoints = 20;
        int lengthPoints = 20;
        int contentPoints = 30;
        GradedActivity essay = new Essay(grammarPoints,spellingPoints,lengthPoints,contentPoints);

        int questionsCorrectFinalExam = 49;
        GradedActivity finalExam = new FinalExam(50,questionsCorrectFinalExam);

        CourseGrades grades = new CourseGrades(lab,exam,essay,finalExam);
        System.out.println(grades.toString());
        System.out.println("\n" + "Course Score: " + grades.getScore() + " Grade: " + grades.getGrade());

        System.out.println("Average Score: " + grades.getAverage() + "\nHighest: " + grades.getHighest().getScore() + "  Lowest: " + grades.getLab().getScore());

    }
}
