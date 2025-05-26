package main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Container implements Iterable<Customer> {
	private Map<String, Customer> hashMap;

	Container(){
		hashMap = new HashMap<>();
	}

	public void addCustomer(Customer customer){
		hashMap.put(customer.getName(), customer);
	}

	public Map<String, Customer> getRecords(){
		return Map.copyOf(this.hashMap);
	}

	public ReadOnlyCustomer find(String customerName){
		return this.hashMap.get(customerName);
	}
	@Override
	public Iterator<Customer> iterator(){
		return this.hashMap.values().iterator();
	}
}
