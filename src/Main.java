package src;

import src.domain.Adopter;
import src.domain.Adress;
import src.domain.PetsAvalable;


public class Main {

private static final sendToAdoptionService sendToAdoptionService = new sendToAdoptionService();
private static final AdoptionService adoptionService = new AdoptionService();


  public static void main(String[] args) {

   System.out.println("Welcome to adoption Center");

    Adopter john = Adopter.builder()
        .name("John")
        .phone("012345678")
            .adress(Adress.builder().street("Strada x").number("33").build())
        .build();
    sendToAdoptionService.addAdopter(john);

    PetsAvalable petsAvalable = adoptionService.listPets();
    System.out.println(petsAvalable);


  }
}
