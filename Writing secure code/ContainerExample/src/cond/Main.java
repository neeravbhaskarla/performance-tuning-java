package cond;

import container.Container;
import container.ReadOnlyCustomer;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCustomer("neerav1");
        container.addCustomer("person1");
        container.addCustomer("person2");

        for(ReadOnlyCustomer customer: container){
            System.out.println(customer);
        }
    }
}
