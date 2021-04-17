package calculateSurface;

public class Rectangular extends Shape {
    public Rectangular(double width, double height) {
        super(width, height);
    }

    @Override
    public double calculateSurface() {
        return super.getHeight() * super.getWidth();
    }
}
