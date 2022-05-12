package java.domain;

public class Dog extends Animal{
    private Integer agressiveness;
    @Override
    public String getDescription() {
        return String.format("Dog breed: %s, gender %s, age: %s, friendliness index %d, short description : %s",
                breed, gender, age, agressiveness, petSpecifications);
    }
}
}
