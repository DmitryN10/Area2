/**
 * Created by Дмитрий on 15.09.2017.
 */
public class Rectangle implements Shape {
    private final double sideLength;
    private final double sideWidth;

    public Rectangle(double sideLength, double sideWidth) {
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    @Override
    public double area() {
        return sideLength*sideWidth;
    }
}