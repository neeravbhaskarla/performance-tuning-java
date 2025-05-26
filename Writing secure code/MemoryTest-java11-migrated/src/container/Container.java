package container;

import customerimplementation.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Container implements Iterable<Customer> {
	private final Map<String, Customer> hashMap;

	public Container(){
		hashMap = new HashMap<>();
	}

	public void addCustomer(String name){
		hashMap.put(name, new Customer(name));
	}

	public Map<String, ReadOnlyCustomer> getRecords(){
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
