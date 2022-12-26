package com.coder.strategy2;

public class ExpenseContext {
	private AbstractExpenseBase expense;
	
	public ExpenseContext(String type) {
		switch(type) {
		case "normal":
			expense = new NormalExpense();
			break;
		case "80%":
			expense = new Discount80Expense();
			break;
		case "50":
			expense = new Discount50Expense();
			break;			
			
		}

	}
	
	public double getResult(double amount) {
		return this.expense.calc(amount);
	}
	
}
