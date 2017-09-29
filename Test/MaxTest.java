import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class MaxTest {
    @Test
    public void testMaxReturnsBiggestFigure(){
        Circle circle5 = new Circle(5);
//        Circle circle6 = new Circle(6);
        Square square = new Square(5);
        assertEquals(circle5, MaxShape.maxArea(circle5, square));
    }

}