package com.ensicaen.jeremielc.designPatterns.observer;

/**
 * Created by jeremie on 16/09/16.
 */
public class MainObserver {

    public static void main(String[] args) {
        Subject s = new Subject();
        Observer obs1 = new Observer(s);
        Observer obs2 = new Observer(s);

        s.addObserver(obs1);
        s.addObserver(obs2);

        s.setNewState(1);
        s.setNewState(2);
    }
}
