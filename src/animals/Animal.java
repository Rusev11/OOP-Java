package animals;

public abstract class Animal {
    private int age;
    private String name;
    private String gender;

    public Animal(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public abstract String sound ();
}
