package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer c = new Customer("Adirian", "test@test.com",1,PowerAgreementType.SPOTPRICE);

        double[][] usage = CustomerPowerUsageData.usage_month_customer1;
        double[][] prices = MonthPowerData.powerprices_month;

        Invoice invoice = new Invoice(c,"March",usage,prices);

        invoice.computeAmount();
        invoice.printInvoice();

    }
}
