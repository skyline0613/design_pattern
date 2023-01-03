package com.corder.templatemethod;

public class HousingClient {

	public static void main(String[] args) {
		
		AbstractHouseTemplate houseType = new WoodenHouse();
		
		//using template method
		houseType.buildHouse();
		System.out.println("************");
		
		houseType = new GlassHouse();
		
		houseType.buildHouse();
	}

}