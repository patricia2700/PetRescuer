package src;

import src.domain.PetsAvalable;
import java.util.Date;
import java.util.stream.Collectors;

public class AdoptionService {
    private static final AdoptionCenter adoptionCenter = new AdoptionCenter();

    public PetsAvalable listPets() {
        return PetsAvalable.builder().petsList(
                adoptionCenter.getAnimalsAvalableForAdoption().stream()
                        .map(p -> PetsAvalable.Pets.builder().description(p.getDescription())
                                .build())
                        .sorted().collect(Collectors.toList())).lastUpdate(new Date()).build();
    }
}
