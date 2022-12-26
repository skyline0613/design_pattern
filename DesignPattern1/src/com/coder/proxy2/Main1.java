package com.coder.proxy2;
/**
 * proxy  + simple factory + Reflection
 * @author Trader520
 *
 */
public class Main1 {

	public static void main(String[] args) {
		
		
		Customer john = new Customer();
		john.setName("John");
		john.setNumber("J001");
		john.setVip(true);
		IFundService fundSvc = new ProxyFundService("fubon", john);
		fundSvc.buy();
		fundSvc.sell();
		
		
		
		Customer andy = new Customer();
		andy.setName("Andy");
		andy.setNumber("A001");
		andy.setVip(true);
		fundSvc = new ProxyFundService("ctbc", andy);
		fundSvc.buy();
		fundSvc.sell();
	}

}
