package Chapter_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void StockTest() {
        Stock s1 = new Stock("ORCL", "Oracle");
        assertEquals("ORCL", s1.symbol);
        assertEquals("Oracle", s1.name);
    }

    @Test
    void getChangePercentTest() {
        Stock s2 = new Stock("ORCL", "Oracle");
        s2.previousClosingPrice = 10;
        s2.currentPrice = 9;
        assertEquals(10, s2.GetChangePercent());
    }

}