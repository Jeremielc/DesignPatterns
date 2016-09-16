package com.ensicaen.jeremielc.designPatterns.observer;

/**
 * Created by jeremie on 16/09/16.
 */
public interface ISubject {

    public void addObserver(Observer obs);
    public void rmObserver(Observer obs);
    public void notifyObservers();
    public int getState();
}
