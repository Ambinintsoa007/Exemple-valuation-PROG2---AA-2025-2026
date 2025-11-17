import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import java.time.Instant;

@Getter
@AllArgsConstructor
@ToString
public class GradeUpdate {
    private final double newValue;
    private final Instant timestamp;
    private final String motif;
}
