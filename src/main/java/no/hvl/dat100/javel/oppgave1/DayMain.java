package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;
        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        //a)
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("\n");
        //b)
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("\n");
        //c)
        System.out.printf("Total forbruken er: %.2f kWt%n", DailyPower.computePowerUsage(powerprices_day));
        //d)
        System.out.printf("Spotpris: %.2f Kr%n",DailyPower.computeSpotPrice(powerusage_day,powerprices_day));
        //f)
        System.out.printf("Strømstøtte: %.2f Kr%n" , DailyPower.computePowerSupport(powerusage_day,powerprices_day));
        //g)
        System.out.printf("Norgesprisen blir da: %.2f Kr%n", DailyPower.computeNorgesPrice(powerusage_day));
        //h)
        System.out.printf("Høyeste forbruk er: %.2f kWt%n", DailyPower.findPeakUsage(powerusage_day));
        //i)
        System.out.printf("Gjennomsnittet på forbruk er: %.2f kWt%n", DailyPower.findAvgPower(powerusage_day));


    }
}
