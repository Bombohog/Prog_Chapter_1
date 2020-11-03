package Chapter_10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyIntegerTest {

    @Test
    void MyIntegerConstructor() {
        MyInteger myInteger = new MyInteger(5);
        assertEquals(5, myInteger.getValue());
    }

    @Test
    void MyIntegerIsEven() {
        MyInteger myInteger = new MyInteger(5);
        assertTrue(myInteger.isOdd());
        assertFalse(myInteger.isEven());
        assertTrue(myInteger.isPrime());
    }

    @Test
    void MyIntegerParseIntChar() {
        assertEquals(134, MyInteger.parseInt(new char[]{'1', '3', '4'}));
        assertEquals(-775, MyInteger.parseInt(new char[]{'-', '7', '7', '5'}));
    }

    @Test
    void MyIntegerParseIntString() {
        assertEquals(643, MyInteger.parseInt("643"));
        assertEquals(-134, MyInteger.parseInt("-134"));
    }

}