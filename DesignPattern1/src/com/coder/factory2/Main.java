package com.coder.factory2;
/**
 * SimpleFactory+Reflection
 * @author Trader520
 *
 */
public class Main {

	public static void main(String[] args) {
		IContractor contractor = ContractorFactory.createContractor("tcs");
		contractor.showName();
		
		contractor = ContractorFactory.createContractor("worldline");
		contractor.showName();
		
	}

}
