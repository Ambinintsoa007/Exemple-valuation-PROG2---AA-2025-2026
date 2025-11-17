import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import java.util.List;
import java.util.ArrayList;

@Getter
@ToString
@AllArgsConstructor
public class Grade {
    private final Student student;
    private final Exam exam;
    private final List<GradeUpdate> historique = new ArrayList<>();
}
