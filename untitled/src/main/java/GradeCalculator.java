import java.time.Instant;
import java.util.List;

public class GradeCalculator {

    private final List<Grade> grades;

    public GradeCalculator(List<Grade> grades) {
        this.grades = grades;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return 0;
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        return 0;
    }
}
