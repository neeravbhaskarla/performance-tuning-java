package main;

public class Customer implements ReadOnlyCustomer {
    private String name;
    Customer(String name){
        this.name = name;
    }


    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
