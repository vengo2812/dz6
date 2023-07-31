package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int amountSales(int[] sales) {

        int totle = 0;
        for (int i = 0; i < sales.length; i++) {
            totle = totle + sales[i];
        }
        return totle;
    }

    public int averageValueSales(int[] sales) {

        int totle = 0;
        for (int i = 0; i < sales.length; i++) {
            totle = totle + sales[i];
        }
        int middle = totle / 12;

        return middle;

    }

    public int belowAverageSales(int[] sales) {

        int middle = 15;
        int below = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] < middle) {
                below = below + 1;
            }

        }
        return below;

    }

    public int aboveAverageSales(int[] sales) {

        int middle = 15;
        int above = 0;
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] > middle) {
                above = above + 1;
            }

        }
        return above;

    }
}