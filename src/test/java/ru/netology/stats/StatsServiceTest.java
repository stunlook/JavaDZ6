package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ShouldSummaAllSales() {
        StatsService service = new StatsService();

        int[] allsales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum1 = 180;
        int actualSum1 = service.SumOfAllSales(allsales);

        Assertions.assertEquals(expectedSum1, actualSum1);
    }

    @Test
    public void SummaMonthAverage() {
        StatsService service = new StatsService();

        int[] averagesum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum2 = 15;
        int actualSum2 = service.AverageSalesPerMonth(averagesum);

        Assertions.assertEquals(expectedSum2, actualSum2);
    }

    @Test
    public void NumberMonthMaxSales() {
        StatsService service = new StatsService();

        int[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.MaxSales(maxMonth);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void NumberMonthMinSales() {
        StatsService service = new StatsService();

        int[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.MinSales(minMonth);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void GetMonthSalesMinAverage() {
        StatsService service = new StatsService();

        int[] MonthMinAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAverage = 5;
        int actualMinAverage = service.SalesBelowAverage(MonthMinAverage);

        Assertions.assertEquals(expectedMinAverage, actualMinAverage);
    }

    @Test
    public void GetMonthSalesMaxAverage() {
        StatsService service = new StatsService();

        int[] MonthMaxAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAverage = 5;
        int actualMaxAverage = service.AboveAverageSales(MonthMaxAverage);

        Assertions.assertEquals(expectedMaxAverage, actualMaxAverage);
    }
}
