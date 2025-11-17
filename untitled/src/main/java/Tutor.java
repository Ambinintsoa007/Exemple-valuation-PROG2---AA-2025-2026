import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
public class Tutor {
    private final int id;
    private final String nom;
    private final String prenom;
    private final LocalDate dateNaissance;
    private final String email;
    private final String telephone;
    private final String relationDescription;
}
