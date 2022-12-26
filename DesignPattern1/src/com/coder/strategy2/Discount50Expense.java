package com.coder.strategy2;

public class Discount50Expense extends AbstractExpenseBase {

	@Override
	public double calc(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.5;
	}

}
