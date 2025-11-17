import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import java.time.Instant;

@Getter
@AllArgsConstructor
@ToString
public class Exam {
    private final int id;
    private final String titre;
    private final Course course;
    private final Instant dateHeure;
    private final int coefficient;
}
