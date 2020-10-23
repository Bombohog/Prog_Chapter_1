package Chapter_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Opg_1Test {

    @Test
    void giveGrade() {
        assertArrayEquals(new String[]{"A", "B", "B", "C", "C"}, Opg_1.giveGrade(5, new int[]{70, 64, 62, 58, 55}));
    }

}