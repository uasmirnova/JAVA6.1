package ru.netology.stats;

public class StatsService {

    public int totalSales(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return (int) total;
    }

    public int mediumSales(long[] sales) {
        long total = 0;
        long medium = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
            medium = total / sales.length;
        }
        return (int) medium;
    }

    public int maxSalesMonth(long[] sales) {
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

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountMinMonth(long[] sales) {
        long medium = mediumSales(sales);
        long amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < medium) {
                amountMonth++;
            }
        }
        return (int) amountMonth;
    }

    public int amountMaxMonth(long[] sales) {
        long medium = mediumSales(sales);
        long amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > medium) {
                amountMonth++;
            }
        }
        return (int) amountMonth;
    }
}
