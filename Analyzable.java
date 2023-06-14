//BS'D
/*
Implement Interface Analyzable in CourseGrades class.
The getAverage method should return the average of the numeric scores stored in the
grades array. The getHighest method should return a reference to the element of the grades
array that has the highest numeric score. The getLowest method should return a reference
to the element of the grades array that has the lowest numeric score. Demonstrate the new
methods in a complete program.
 */

public interface Analyzable {
    public double getAverage();
    public GradedActivity getHighest();
    public GradedActivity getLowest();
}
