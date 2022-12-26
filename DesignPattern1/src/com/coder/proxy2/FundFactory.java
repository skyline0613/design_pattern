package com.coder.proxy2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FundFactory {

	public static IFundService createFundService(String fundName, Customer customer) {

		fundName = fundName.toLowerCase();
		fundName = fundName.substring(0, 1).toUpperCase() + fundName.substring(1);

		IFundService fundService = (IFundService)createObject("com.coder.proxy2."+fundName+"FundService", customer);

		return fundService;
	}

	static Object createObject(String className, Customer customer) {
		Object object = null;
		try {
			Class classDefinition = Class.forName(className);
			Constructor constructor =
					classDefinition.getConstructor(new Class[]{Customer.class});
			object = classDefinition.getDeclaredConstructor(Customer.class).newInstance(customer);
		} catch (InstantiationException e) {
			System.out.println(e);
		} catch (IllegalAccessException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
