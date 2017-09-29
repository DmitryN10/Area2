import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 29.09.2017.
 */
class SquareTest {

    @Test
    public void testSquare(){
        Square square = new Square(5);

        assertEquals(25, square.area());
//        assertEquals(24, square.area());
    }

}