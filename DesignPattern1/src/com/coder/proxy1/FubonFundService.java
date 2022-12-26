package com.coder.proxy1;

public class FubonFundService implements IFundService {
	
	private Customer customer;
	public FubonFundService(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void buy() {
		System.out.println(customer.getName() +" buy Fubon's fund!");

	}

	@Override
	public void sell() {
		System.out.println(customer.getName() +" sell Fubon's fund!");
	}

}
