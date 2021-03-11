import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testAreaIsSixIfSidesAreThreeAndTwo() {
        int length = 3;
        int breadth = 2;
        int expectedArea = 6;
        Rectangle rectangle = new Rectangle(length,breadth);
        int actualArea = rectangle.area();

        assertEquals(expectedArea,actualArea);
    }

    @Test
    void testAreaIsEightIfSidesAreFourAndTwo() {
        int length = 4;
        int breadth = 2;
        int expectedArea = 8;
        Rectangle rectangle = new Rectangle(length,breadth);
        int actualArea = rectangle.area();

        assertEquals(expectedArea,actualArea);
    }
}