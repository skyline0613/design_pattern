package com.coder.proxy1;

public class ProxyFundService implements IFundService {

	private CtbcFundService func;
	public ProxyFundService(Customer customer) {
		func = new CtbcFundService(customer);
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
