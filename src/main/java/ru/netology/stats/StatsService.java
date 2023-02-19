package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total = total + sale;

        }
        return total;

    }
    public long middle(long[] sales) {
        long middlesale = 0;
        for (long sale : sales) {
            middlesale = middlesale + sale;
        }
        return middlesale/12;
    }
    public long bigSale(long[] sales) {
        long bigSaleMonth = 0;
        long bigSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= bigSales) {
                bigSaleMonth = i;
                bigSales = sales[i];
            }

        }
        return bigSaleMonth + 1;
    }
    public long smallSale(long[] sales) {
        long smallSaleMonth = 0;
        long smallSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= smallSale) {
                smallSaleMonth = i;
                smallSale = sales[i];
            }
        }
        return smallSaleMonth + 1;
    }
    public int amountmonthBelowTheAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < middle((sales))) {
                counter++;
            }
        }
        return counter;
    }
    public int amountmonthAboveAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > middle((sales))) {
                result++;
            }
        }
        return result;

}
