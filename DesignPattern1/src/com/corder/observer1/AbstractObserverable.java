package com.corder.observer1;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractObserverable implements IObserverable{
    List<IObserver> list = new ArrayList<>();
    
    //¸`¥Ø¦WºÙ
    String name = null;
    String program = null;    
    public AbstractObserverable(String name) {
    	this.name = name;
    }
    
    public AbstractObserverable(String name, String program) {
    	this.name = name;
    	this.program = program;
    }

    @Override
    public void add(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        list.remove(observer);
    }

    public String getName() {
        return this.name;
    }    
 
    public void setName(String name) {
        this.name = name;
    } 
    
    
    
    
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Override
	public void notifyObservers() {
        for (IObserver o: list) {
            o.update();
        }
		
	}
}
