package java.domain;

public class Cat extends Animal{
    private Fur furType;
    @Override
    public String getDescription() {
        return String.format("Cat breed: %s, gender %s, age: %s, fur type %s, short description : %s",
                breed, gender, age, furType, petSpecifications);
    }
}
