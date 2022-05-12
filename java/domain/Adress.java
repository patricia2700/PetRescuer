package java.domain;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class Adress {
    String street;
    String number;
}
