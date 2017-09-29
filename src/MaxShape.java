import java.awt.geom.Area;

/**
 * Created by user on 29.09.2017.
 */
public class MaxShape {
    Circle f = new Circle(5);
    Circle d = new Circle(6);
    public static Shape maxArea(Shape f, Shape d){
        if (f.area() > d.area()){
            return f;
        }
        return d;
    }
}
