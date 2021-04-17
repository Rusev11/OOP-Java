package calculateSurface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4.6);
        shapes[1] = new Triangle(3, 5.1);
        shapes[2] = new Rectangular(2,1);
        shapes[3] = new Circle(2.2);
        shapes[4] = new Rectangular(4.6, 1);

        double[] areas = new double[5];
        for (int i = 0; i < shapes.length ; i++) {
            areas[i] = shapes[i].calculateSurface();
        }
        Arrays.stream(areas).forEach(System.out::println);
    }
}
