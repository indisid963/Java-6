package ru.netology.stats;

public class StatsService {
    public long Amount(long[] sales) {
        long AmountSales = 0;
        for (long sale : sales) {
            AmountSales += sale;
        }
        return AmountSales;
    }

    public long AverageSales(long[] sales) {
        return Amount(sales) / sales.length;
    }

    public int MaxSalesMonth(long[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public int MinSalesMonth(long[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public int MinAverageMonth(long[] sales) {
        long AverageSale = AverageSales(sales);
        int MinAverage = 0;
        for (long sale : sales) {
            if (sale < AverageSale) {
                MinAverage++;
            }
        }
        return MinAverage;
    }

    public int MoreAverageMonth(long[] sales) {
        long AverageSale = AverageSales(sales);
        int MoreAverage = 0;
        for (long sale : sales) {
            if (sale > AverageSale) {
                MoreAverage++;
            }
        }
        return MoreAverage;
    }
}





