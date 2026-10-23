package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        System.out.println("Pris tabell\n");
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%.2f NOK ", prices[i]);
        }
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {
        System.out.println("Strømm tabell\n");
        for (int i = 0; i < usage.length; i++) {
            System.out.printf("%2f kWh ", usage[i]);
        }

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for (int i = 0; i < usage.length; i++) {
            sum += usage[i];
        }
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            price += usage[i] * prices[i];
        }
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;

        if (price > THRESHOLD){
            support = (price - THRESHOLD) * PERCENTAGE * usage;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++){
            support += getSupport(usage[i],prices[i]);
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            price += usage[i] * 0.5;
        }

        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for (int i = 0; i < usage.length; i++){
            if (usage[i] > temp_max){
                temp_max = usage[i];
            }
        }

        return temp_max;
    }
    // i) Find average
    public static double findAvgPower(double[] usage) {

        double average = 0;

        for (int i = 0; i < usage.length; i++){
            average += usage[i];
        }

        average = average / usage.length;

        return average;
    }
}
