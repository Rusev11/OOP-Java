package animals;

public class Cat extends Animal {
    public Cat(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String sound() {
        return "Mau mau";
    }
}
