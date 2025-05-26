package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String args[]) {
		Container container = new Container();
		container.addCustomer(new Customer("Neerav"));
		container.addCustomer(new Customer("Person1"));
		container.addCustomer(new Customer("Person2"));

        for (Customer customer : container) {
            System.out.print(customer.getName() + " ");
        }
	}
}
