package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();


        Customer customer1 = new Customer("Adirian", "HEI@test.no",22,PowerAgreementType.SPOTPRICE);

        System.out.println(customer1);


    }
}
