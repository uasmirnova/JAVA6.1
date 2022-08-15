package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void statisticTestTotal() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotal = 180;
        long actualTotal = service.totalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void statisticTestMedium() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMedium = 15;
        long actualMedium = service.mediumSales(sales);

        Assertions.assertEquals(expectedMedium, actualMedium);
    }

    @Test
    public void statisticTestMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void statisticTestMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinMonth = 9;
        long actualMinMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void statisticTestAmountMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmountMin = 5;
        long actualAmountMin = service.amountMinMonth(sales);

        Assertions.assertEquals(expectedAmountMin, actualAmountMin);
    }

    @Test
    public void statisticTestAmountMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmountMax = 5;
        long actualAmountMax = service.amountMaxMonth(sales);

        Assertions.assertEquals(expectedAmountMax, actualAmountMax);
    }
}
