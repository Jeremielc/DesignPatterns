package com.ensicaen.jeremielc.designPatterns.singleton;

/**
 * Created by jeremie on 16/09/16.
 */
public final class Singleton {

    private static Singleton instance = new Singleton();
    private static int nbAllocations = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void alloc() {
        nbAllocations += 1;
    }

    public void desalloc() {
        nbAllocations -= 1;
    }

    public int getNbAllocations() {
        return nbAllocations;
    }
}
