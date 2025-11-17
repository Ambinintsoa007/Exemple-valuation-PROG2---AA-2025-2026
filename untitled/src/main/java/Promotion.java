import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import java.util.Set;

@Getter
@AllArgsConstructor
@ToString
public class Promotion {
    private final Set<String> groupes;
}