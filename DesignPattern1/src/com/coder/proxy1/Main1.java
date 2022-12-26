package com.coder.proxy1;
/**
 * proxy pattern
 * @author Trader520
 *
 */
public class Main1 {

	public static void main(String[] args) {
		Customer john = new Customer();
		john.setName("John");
		john.setNumber("J001");
		john.setVip(true);
		IFundService fundSvc = new ProxyFundService(john);
		fundSvc.buy();
		fundSvc.sell();
		
		
	}

}
