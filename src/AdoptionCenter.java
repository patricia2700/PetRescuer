package src;

import lombok.Getter;

import src.domain.Animal;
import src.domain.Cat;
import src.domain.Dog;
import src.domain.Fur;
import java.util.ArrayList;
import java.util.List;
@Getter
public class AdoptionCenter {
    private List<Animal> animalsAvalableForAdoption = new ArrayList<>();

    public AdoptionCenter() {
        Cat cat1 = Cat.builder().age(3).breed("persian").gender("F").type(Fur.LONG_HAIR).specif("She likest to stay outside").build();
        Cat cat2 = Cat.builder().age(4).breed("caucasian").gender("F").type(Fur.SHORT_HAIR).specif("She likest to eat").build();
        Dog dog1 = Dog.builder().age(5).agressiveness(2).breed("husky").gender("M").specif("Suited for children").build();
        animalsAvalableForAdoption.add(cat1);
        animalsAvalableForAdoption.add(cat2);
        animalsAvalableForAdoption.add(dog1);
    }
}
