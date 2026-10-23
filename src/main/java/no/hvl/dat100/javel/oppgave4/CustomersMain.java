package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customer c = new Customer("Adirian","A@TEST.NO", 1,PowerAgreementType.SPOTPRICE);

        //a)
        Customers customers = new Customers(10);
        //b)
        System.out.println("Antall kunder: " + customers.countNonNull());
        //c)
        Customer treff = customers.getCustomer(1);
        System.out.println(treff);
        //d)
        customers.addCustomer(c);
        //e)
        //Customer removed = customers.removeCustomer(1);
        //f)
        Customer[] customerTabell = customers.getCustomers();
        for (int i = 0; i < customerTabell.length; i++){
            System.out.println(customerTabell[i]);
        }

    }
}
