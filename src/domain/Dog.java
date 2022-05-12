package src.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal{
    private Integer agressiveness;

    @Builder
    public Dog(String breed, String gender, Integer age, Integer agressiveness, String specif) {
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.agressiveness = agressiveness;
        this.petSpecifications = specif;
    }
    @Override
    public String getDescription() {
        return String.format("Dog breed: %s, gender %s, age: %s, friendliness index %d, short description : %s",
                breed, gender, age, agressiveness, petSpecifications);
    }
}

