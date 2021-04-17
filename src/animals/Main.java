package animals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat(4, "Jane", "male"));
        animals.add(new Dog(6, "Doggy", "female"));
        animals.add(new Frog(1, "Curmit", "male"));
        animals.add(new Kitten(1, "Tim", "female"));
        animals.add(new Tomcat(6, "Jack", "mmale"));

        animals.forEach(animal -> System.out.printf("%s is %d years old and makes the sound %s\n", animal.getName(), animal.getAge(), animal.sound()));
    }
}
