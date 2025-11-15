import org.junit.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {

    @Test
    public void testGetExamGrade() {

        Student student = new Student(
                1, "Doe", "John", LocalDate.of(2000, 1, 1),
                "john@mail.com", "0000", "G1", null
        );

        Teacher teacher = new Teacher(
                1, "Smith", "Anna", LocalDate.of(1980, 1, 1),
                "teacher@mail.com", "1111", "backend"
        );

        Course course = new Course(1, "PROG2", 5, teacher);

        Exam exam = new Exam(1, "Exam PROG2", course,
                Instant.parse("2024-01-01T10:00:00Z"), 2);

        Grade grade = new Grade(student, exam);
        grade.getHistorique().add(new GradeUpdate(12.0,
                Instant.parse("2024-01-01T09:00:00Z"), "initial"));

        GradeCalculator service = new GradeCalculator(List.of(grade));

        double value = service.getExamGrade(exam, student,
                Instant.parse("2024-01-01T12:00:00Z"));

        assertEquals(12.0, value);
    }

    @Test
    public void testGetCourseGrade() {

        Student student = new Student(
                1, "Doe", "John", LocalDate.of(2000, 1, 1),
                "john@mail.com", "0000", "G1", null
        );

        Teacher teacher = new Teacher(
                1, "Smith", "Anna", LocalDate.of(1980, 1, 1),
                "teacher@mail.com", "1111", "backend"
        );

        Course course = new Course(1, "PROG2", 5, teacher);

        Exam exam1 = new Exam(1, "Exam 1", course,
                Instant.parse("2024-01-01T10:00:00Z"), 2);

        Exam exam2 = new Exam(2, "Exam 2", course,
                Instant.parse("2024-02-01T10:00:00Z"), 3);

        Grade grade1 = new Grade(student, exam1);
        grade1.getHistorique().add(new GradeUpdate(10.0,
                Instant.parse("2024-01-01T09:00:00Z"), "initial"));

        Grade grade2 = new Grade(student, exam2);
        grade2.getHistorique().add(new GradeUpdate(15.0,
                Instant.parse("2024-02-01T09:00:00Z"), "initial"));

        GradeCalculator service = new GradeCalculator(List.of(grade1, grade2));

        double result = service.getCourseGrade(course, student,
                Instant.parse("2024-03-01T00:00:00Z"));

        assertEquals(13.0, result);
    }
}
