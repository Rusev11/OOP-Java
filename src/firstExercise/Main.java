package firstExercise;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 4.12);
        System.out.println(student.getGrade());
        Worker worker = new Worker("Pesho", "Georgiev", 45, 8);
        System.out.println(worker.getWagePerHour());

    }
}
