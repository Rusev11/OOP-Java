package animals;

public class Tomcat extends Animal {
    public Tomcat(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String sound() {
        return "Mrrrr";
    }
}
