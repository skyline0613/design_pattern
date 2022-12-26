package com.coder.strategy1;

public class ExpenseContext {
	private AbstractExpenseBase expense;
	
	public ExpenseContext(AbstractExpenseBase strategy) {
		this.expense = strategy;
	}
	
	public double getResult(double amount) {
		return this.expense.calc(amount);
	}
	
}
