package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        System.out.println("Månedlig forbruk");
        for (int i = 0; i < usage.length; i++) {
            System.out.print("Dag " + (i + 1) + ": ");
            for (int j = 0; j < usage[i].length; j++) {
                System.out.printf("%2f kWt ", usage[i][j]);
            }
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        System.out.println("Månedlig pris per dag");
        for (int i = 0; i < prices.length; i++){
            System.out.print("Dag " + (i + 1) + ": ");
            for (int j = 0; j < prices[i].length; j++) {
                System.out.printf("%2f Kr ", prices[i][j]);
            }
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++){
            for (int j = 0; j < usage[i].length; j++){
                sum += usage[i][j];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        for (int i = 0; i < powerusage.length; i++){
            for (int j = 0; j < powerusage[i].length; j++){
                usage += powerusage[i][j];
            }
        }
        if (usage > threshold){
            exceeded = true;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i  = 0; i < usage.length; i++){
            for (int j = 0; j < usage[i].length; j++){
                price += usage[i][j]*prices[i][j];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++){
            for (int j = 0; j < usage[i].length; j++){
                if (prices[i][j] > 0.963){
                    support += usage[i][j] * (prices[i][j] - 0.963) * 0.90;
                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (double[] dag : usage){
            for (double time : dag){
                price += time * 0.5;
            }
        }

        return price;
    }
}
