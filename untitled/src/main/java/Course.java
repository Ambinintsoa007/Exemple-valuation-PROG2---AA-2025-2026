import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Course {
    private final int id;
    private final String label;
    private final int credits;
    private final Teacher teacher;
}
