package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void monthMinSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void monthMaxSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int expected1 = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, expected1, actual);
    }

    @Test

    public void amountSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.amountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void averageValueSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageValueSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void belowAverageSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void aboveAverageSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
