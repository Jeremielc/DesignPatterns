package com.ensicaen.jeremielc.designPatterns.observer;

/**
 * Created by jeremie on 16/09/16.
 */
public class Observer implements IObserver {

    private int state;
    private ISubject subject;

    public Observer(ISubject subject) {
        this.subject = subject;
        state = subject.getState();
    }

    @Override
    public void update() {
        state = subject.getState();
        System.out.println("Update : state vaut maintenant : " + state);
    }
}
