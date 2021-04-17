package calculateSurface;

public class Triangle extends Shape {

    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double calculateSurface() {
        return super.getHeight() * super.getWidth() / 2;
    }
}
