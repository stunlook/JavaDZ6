package ru.netology.stats;

public class StatsService {
    public int SumOfAllSales(int[] allsales) {
        int sum1 = 0;
        for (int i = 0; i < allsales.length; i++) {
            sum1 = sum1 + allsales[i];
        }
        return sum1;
    }

    public int AverageSalesPerMonth(int[] averagesum) {
        int average = 0;
        int sum2 = 0;
        for (int i = 0; i < averagesum.length; i++) {
            sum2 += averagesum[i];
        }
        average = sum2 / averagesum.length;

        return Math.round(average);
    }

    public int MaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int MinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int SalesBelowAverage(int[] month) {
        int amount = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > AverageSalesPerMonth(month)) {
                amount++;
            }
        }
        return amount;
    }
    public int AboveAverageSales(int[] month) {
        int amount = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < AverageSalesPerMonth(month)) {
                amount++;
            }
        }
        return amount;
    }
}