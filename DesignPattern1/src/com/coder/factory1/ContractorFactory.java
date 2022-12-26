package com.coder.factory1;

public class ContractorFactory {

	public static IContractor createContractor(String company) {
		IContractor contractor;
		switch(company) {
			case "tcs":
				contractor = new Tcs();
				break;
			case "worldline":
				contractor = new Worldline();
				break;
			default:
				contractor = null;
		}
		return contractor;
	}

}
