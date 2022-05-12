package java.domain;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class Adopter {
    private String name;
    private String phone;
    private Adress adress;
}
