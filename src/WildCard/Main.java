package WildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList();
        animalList.add(new Animal());
        animalList.add(new Dog());

        List<Dog> dogList = new ArrayList();
        dogList.add(new Dog());
        dogList.add(new Dog());
    }

    // Accept only List<Animal> and not List<Dog>
    public static void printAnimals(List<Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).toString());
        }
    }

    // Accept only List<Dog> and not List<Animal>
    public static void printDogs(List<Dog> dogList) {
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i).toString());
        }
    }

    // Now it accepts List<Dog> as well
    public static void printAnimalsUsingWildCard(List<? extends Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).toString());
        }
    }

    // Now it accepts List<Animal> as well
    public static void printDogsUsingWildCard(List<? super Dog> dogList) {
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i).toString());
        }
    }


}
