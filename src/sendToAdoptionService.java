package src;

import src.domain.Adopter;
import java.util.ArrayList;
import java.util.List;

public class sendToAdoptionService {
    private static final List<Adopter> adopters = new ArrayList<>();

    public void addAdopter(Adopter adopter) {
        adopters.add(adopter);
    }
}
