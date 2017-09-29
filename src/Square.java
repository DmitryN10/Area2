/**
 * Created by Дмитрий on 15.09.2017.
 */
public class Square implements Shape {

    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength*sideLength;
    }
}