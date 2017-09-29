import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class RectangleTest {
    @Test
    public void TestArea(){
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals(30, rectangle.area());
    }


}