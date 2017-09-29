/**
 * Created by Дмитрий on 15.09.2017.
 */
public class Circle implements Shape {
    private final double sideRadius;

    public Circle(double sideRadius) {
        this.sideRadius = sideRadius;
    }

    @Override
    public double area() {
        return Math.PI*sideRadius*sideRadius;

    }
}