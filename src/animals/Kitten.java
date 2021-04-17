package animals;

public class Kitten extends Animal {
    public Kitten(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String sound() {
        return "mmmmmau";
    }
}
