package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //a)
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println("\n");
        //b)
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println("\n");
        //c)
        System.out.printf("Totale bruk er: %.2f kWt%n", MonthlyPower.computePowerUsage(power_usage_month));
        //d)
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, 100));
        //e)
        System.out.println("Spot prisen er: " + MonthlyPower.computeSpotPrice(power_usage_month,power_prices_month));
        //f)
        System.out.println("Strømmstøtten er: "+ MonthlyPower.computePowerSupport(power_usage_month,power_prices_month) + " Kr");
        //g)
        System.out.println("Norgesprisen uu mpneden er: "+ MonthlyPower.computeNorgesPrice(power_usage_month) +"Kr");
    }
}