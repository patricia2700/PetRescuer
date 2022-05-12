package src.domain;
import lombok.Getter;
@Getter
public abstract class Animal {
    protected String breed;
    protected Integer age;
    protected String petSpecifications;
    protected String gender;

    public abstract String getDescription();
}
