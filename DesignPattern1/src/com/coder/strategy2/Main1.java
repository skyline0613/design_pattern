package com.coder.strategy2;
/**
 * Strategy + Simple Factory
 * @author Trader520
 *
 */
public class Main1 {

	public static void main(String[] args) {

		AbstractExpenseBase strategy = new NormalExpense();
		System.out.println(strategy.calc(1000));

		strategy = new Discount50Expense();
		System.out.println(strategy.calc(1000));

		strategy = new Discount80Expense();
		System.out.println(strategy.calc(1000));		
		
		
	}

}
