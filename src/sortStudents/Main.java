package sortStudents;

import firstExercise.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();

        Student[] students = new Student[10];
        students[0] = new Student("Ivan", "Ivanov", 3.51);
        students[1] = new Student("Dragan", "Ivanov", 5.15);
        students[2] = new Student("Cvetan", "Ivanov", 2.01);
        students[3] = new Student("Petkan", "Ivanov", 6.00);
        students[4] = new Student("Sharan", "Ivanov", 4.81);
        students[5] = new Student("Boyan", "Ivanov", 3.08);
        students[6] = new Student("Kaloyan", "Ivanov", 5.47);
        students[7] = new Student("Pesho", "Ivanov", 5.49);
        students[8] = new Student("Gosho", "Ivanov", 4.99);
        students[9] = new Student("Stamat", "Ivanov", 4.03);

//        students.add ( new Student("Ivan", "Ivanov", 3.51));
//        students.add ( new Student("Dragan", "Ivanov", 5.15));
//        students.add ( new Student("Cvetan", "Ivanov", 2.01));
//        students.add ( new Student("Petkan", "Ivanov", 6.00));
//        students.add ( new Student("Sharan", "Ivanov", 4.81));
//        students.add ( new Student("Boyan", "Ivanov", 3.08));
//        students.add ( new Student("Kaloyan", "Ivanov", 5.47));
//        students.add ( new Student("Pesho", "Ivanov", 5.49));
//        students.add ( new Student("Gosho", "Ivanov", 4.99));
//        students.add ( new Student("Stamat", "Ivanov", 4.03));
//
//        Collections.sort(students, new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.getGrade()<o2.getGrade()){
//                    return -1;
//                }
//                if(o1.getGrade()>o2.getGrade()){
//                    return 1;
//                }
//                return 0;
//            }
//        });
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + student.getGrade());
        }
    }
}
