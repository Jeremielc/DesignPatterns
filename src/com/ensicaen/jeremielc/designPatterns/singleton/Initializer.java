package com.ensicaen.jeremielc.designPatterns.singleton;

/**
 * Created by jeremie on 16/09/16.
 */
public class Initializer implements IUser {

    public Initializer() {

    }

    public void doSomething() {
        Singleton s = Singleton.getInstance();
        System.out.println("Valeur initiale : " + s.getNbAllocations());
        s.alloc();
        System.out.println("Premiere allocation : " + s.getNbAllocations());
    }

}
