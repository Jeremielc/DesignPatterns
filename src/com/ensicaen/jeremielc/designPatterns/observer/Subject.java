package com.ensicaen.jeremielc.designPatterns.observer;

import java.util.ArrayList;

/**
 * Created by jeremie on 16/09/16.
 */
public class Subject implements ISubject {

    private ArrayList<Observer> obsList;
    private int state;

    public Subject() {
        obsList = new ArrayList<>();
        state = 0;
    }

    @Override
    public void addObserver(Observer obs) {
        obsList.add(obs);
    }

    @Override
    public void rmObserver(Observer obs) {
        obsList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : obsList) {
            obs.update();
        }
    }

    public void setNewState(int newState) {
        state = newState;
        notifyObservers();
    }

    @Override
    public int getState() {
        return state;
    }
}
