package com.corder.observer1;

public class Main {

	public static void main(String[] args) {
        IObserverable podcast = new ICRT("英文廣播");
        IObserver student1 = new Student("John",podcast);
        
        IObserver student2 = new Student("Mary",podcast);
        
        podcast.add(student1);
        podcast.add(student2);
        podcast.notifyObservers();

        ((ICRT) podcast).setProgram("中文廣播");
        podcast.notifyObservers();
        
        ((ICRT) podcast).setProgram("韓文廣播");
        podcast.notifyObservers();   
        
        IObserverable podcast2 = new KissRadio("英文廣播");    
        student1 = new Student("John",podcast2);
        podcast2.add(student1);       
        podcast2.notifyObservers();
        ((KissRadio) podcast2).setProgram("中文廣播");
        podcast2.notifyObservers();       
	}

}
