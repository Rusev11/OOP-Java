package animals;

public class Frog extends Animal {
    public Frog(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String sound() {
        return "Kvak kvak";
    }
}
