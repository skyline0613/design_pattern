package com.coder.proxy2;

public class CtbcFundService implements IFundService {
	
	private Customer customer;
	public CtbcFundService(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void buy() {
		System.out.println(customer.getName() +" buy CTBC's fund!");

	}

	@Override
	public void sell() {
		System.out.println(customer.getName() +" sell CTBC's fund!");
	}

}
