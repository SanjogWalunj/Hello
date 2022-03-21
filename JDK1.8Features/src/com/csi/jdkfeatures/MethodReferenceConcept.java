package com.csi.jdkfeatures;

import java.util.ArrayList;
import java.util.List;

class Customer
{
	int custId;
	
	String custName;

	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
	
	
	
}
public class MethodReferenceConcept {
	
	
	public static void main(String[] args) {

		List<Customer> cc = new ArrayList<Customer>();
		
		cc.add(new Customer(121, "BINU"));
		cc.add(new Customer(199, "MANI"));
		
		//cc.forEach(System.out::println);
		
		cc.forEach(cust->System.out.println(cust));
		
	}
}
