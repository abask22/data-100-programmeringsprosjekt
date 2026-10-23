package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;

    }

    public void computeAmount() {

        amount = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {

                if (c.getAgreement() == PowerAgreementType.SPOTPRICE) {
                    amount += usage[i][j] * prices[i][j];
                } else if (c.getAgreement() == PowerAgreementType.POWERSUPPORT) {
                    double support = usage[i][j] * Math.max(0, prices[i][j] - 0.937) * 0.9;
                    amount += usage[i][j] * prices[i][j] - support;

                } else if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
                    amount += usage[i][j] * 0.5;

                }
            }
        }

    }

    public void printInvoice() {

        double totalUsage = 0;

        for (int i = 0; i < usage.length; i++){
            for (int j = 0; j < usage[j].length; j++){
                totalUsage += usage[i][j];
            }
        }

        System.out.println("Customer number: " + c.getCustomer_id());
        System.out.println("Name: " + c.getName());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Agreement " + c.getAgreement());
        System.out.println();
        System.out.println("Month " + month);
        System.out.printf("Usage: %.2f kWt%n", totalUsage);
        System.out.printf("Amount: %.2f Kr%n" , amount);


    }

}

