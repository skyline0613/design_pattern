package com.coder.strategy1;

public class Discount80Expense extends AbstractExpenseBase {

	@Override
	public double calc(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.8;
	}

}
