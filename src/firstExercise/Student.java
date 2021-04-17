package firstExercise;

public class Student extends Human implements Comparable<Student>{
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student s) {
        if(this.grade<s.getGrade()){
            return -1;
        }
        if(this.grade<s.getGrade()){
            return 1;
        }
        return 0;
    }
}
