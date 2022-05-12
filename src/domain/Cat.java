package src.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal{
    private Fur furType;
    @Builder
    public Cat(String breed, String gender, Integer age, Fur type, String specif) {
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.furType = type;
        this.petSpecifications = specif;
    }
    @Override
    public String getDescription() {
        return String.format("Cat breed: %s, gender %s, age: %s, fur type %s, short description : %s",
                breed, gender, age, furType, petSpecifications);
    }
}
