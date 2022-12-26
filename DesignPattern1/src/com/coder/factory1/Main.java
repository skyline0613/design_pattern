package com.coder.factory1;
/**
 * SimpleFactory
 * @author Trader520
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		IContractor contractor;
		
		contractor = new Tcs();
		contractor.showName();
		
		contractor = new Worldline();
		contractor.showName();
		
		
		
		 contractor = ContractorFactory.createContractor("tcs");
		contractor.showName();
		
		contractor = ContractorFactory.createContractor("worldline");
		contractor.showName();
		
	}

}
