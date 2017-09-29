import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class CircleTest {
    @Test
    public void testCircle(){
        Circle circle = new Circle(5);
        assertEquals(Math.PI*5*5, circle.area());
    }

}