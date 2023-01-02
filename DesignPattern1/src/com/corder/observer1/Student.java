package com.corder.observer1;

public class Student implements IObserver {

    IObserverable observerable;
    String name;

    public Student(String name, IObserverable observerable){
    	this.name = name;
        this.observerable = observerable;
    }

    @Override
    public void update() {
        System.out.println("學生["+this.name+"]聽了" + ((AbstractObserverable)observerable).getName() + ((AbstractObserverable)observerable).getProgram());
    }

}