package com.ensicaen.jeremielc.designPatterns.singleton;

/**
 * Created by jeremie on 16/09/16.
 */
public class User implements IUser {

    public User() {

    }

    public void doSomething() {
        Singleton s = Singleton.getInstance();
        s.alloc();
        System.out.println("Deuxieme allocation : " + s.getNbAllocations());
        s.desalloc();
        System.out.println("Après desallocation : " + s.getNbAllocations());
    }
}
