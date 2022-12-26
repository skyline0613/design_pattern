package com.coder.factory2;

public class ContractorFactory {

	public static IContractor createContractor(String company) {

		company = company.toLowerCase();
		company = company.substring(0, 1).toUpperCase() + company.substring(1);

		IContractor contractor = (IContractor)createObject("com.coder.factory2."+company);

		return contractor;
	}

	static Object createObject(String className) {
		Object object = null;
		try {
			Class classDefinition = Class.forName(className);
			object = classDefinition.newInstance();
		} catch (InstantiationException e) {
			System.out.println(e);
		} catch (IllegalAccessException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return object;
	}
}
