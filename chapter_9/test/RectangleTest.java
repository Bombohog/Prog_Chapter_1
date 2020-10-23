import Chapter_9.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void testRectangle() {
        Rectangle rect = new Rectangle();
        assertEquals(1, rect.width);
        assertEquals(1, rect.height);
    }
    @Test
    public void testRectangle2() {
        Rectangle rect = new Rectangle(10, 10);
        assertEquals(10, rect.width);
        assertEquals(10, rect.height);
    }

    @Test
    public void testGetArea() {
        Rectangle rect1 = new Rectangle(2,2);
        assertEquals(4, rect1.GetArea());

        Rectangle rect2 = new Rectangle(5,5);
        assertEquals(25, rect2.GetArea());

        Rectangle rect3 = new Rectangle(10,10);
        assertEquals(100, rect3.GetArea());
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rect1 = new Rectangle(2,2);
        assertEquals(8, rect1.GetPerimeter());

        Rectangle rect2 = new Rectangle(5,5);
        assertEquals(20, rect2.GetPerimeter());

        Rectangle rect3 = new Rectangle(10,10);
        assertEquals(40, rect3.GetPerimeter());
    }

}