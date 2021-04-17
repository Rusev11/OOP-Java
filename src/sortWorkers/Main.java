package sortWorkers;

import firstExercise.Worker;
import firstExercise.Worker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Worker[] workers = new Worker[10];
        workers[0] = new Worker("Ivan", "Ivanov", 60, 8);
        workers[1] = new Worker("Dragan", "Ivanov", 50, 8);
        workers[2] = new Worker("Cvetan", "Ivanov", 62, 8);
        workers[3] = new Worker("Petkan", "Ivanov", 48, 8);
        workers[4] = new Worker("Sharan", "Ivanov", 52, 8);
        workers[5] = new Worker("Boyan", "Ivanov", 60, 8);
        workers[6] = new Worker("Kaloyan", "Ivanov", 39, 8);
        workers[7] = new Worker("Pesho", "Ivanov", 44, 8);
        workers[8] = new Worker("Gosho", "Ivanov", 55, 8);
        workers[9] = new Worker("Stamat", "Ivanov", 68, 8);

        Arrays.sort(workers);
        Arrays.stream(workers).forEach(System.out::println);
    }
}
