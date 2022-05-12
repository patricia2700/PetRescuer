package src.domain;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class AdoptionRequest {
    private Adopter adopter;
    private Adress adress;
    private Date dayOfAdoptionConfirmation;
    private Date dayOfAdoption;

    private List<Animal> petsAdopted;
}
