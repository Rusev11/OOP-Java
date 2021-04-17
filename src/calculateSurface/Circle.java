package calculateSurface;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateSurface() {
        return Math.PI * Math.pow(super.getWidth(), 2);
    }
}
