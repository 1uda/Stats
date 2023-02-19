package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartServiceTest {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sum(sales);
        Assertions.assertEquals(expectedSum, actualSum);

    }
    @Test
    public void testmiddle() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMiddle = 15;
        long actualMiddle = service.middle(sales);
        Assertions.assertEquals(expectedMiddle, actualMiddle);
    }
    @Test
    public void testbigsalemonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBig = 8;
        long actualBig = service.bigSale(sales);
        Assertions.assertEquals(expectedBig, actualBig);
    }
    @Test
    public void testsmallsalemonth() {
    	StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSmall = 9;
        long actualSmall = service.smallSale(sales);
        Assertions.assertEquals(expectedSmall, actualBig);
    }
    @Test
    public void testamountmonthBelowTheAverage() {
    	StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelow = 5;
        long actualBelow = service.amountmonthBelowTheAverage(sales);
        Assertions.assertEquals(expectedBelow, actualBelow);
    }
    @Test
    public void testamountmonthAboveAverage() {
    	StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAbove = 5;
        long actualAbove = service.amountmonthAboveAverage(sales);
        Assertions.assertEquals(expectedAbove, actualAbove);

}
