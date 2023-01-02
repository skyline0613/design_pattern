package com.corder.observer1;


public class KissRadio extends AbstractObserverable {

	public KissRadio() {
		super("Kiss radio");
	}
	public KissRadio(String program) {
		super("Kiss radio", program);
	}
}