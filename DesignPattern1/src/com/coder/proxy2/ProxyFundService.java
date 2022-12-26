package com.coder.proxy2;

public class ProxyFundService implements IFundService {

	private IFundService func;
	public ProxyFundService(String fundName, Customer customer) {
		
		func = FundFactory.createFundService(fundName, customer);
	}
	@Override
	public void buy() {
		func.buy();
	}

	@Override
	public void sell() {
		func.sell();
	}

}
