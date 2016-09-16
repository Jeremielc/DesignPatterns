package com.ensicaen.jeremielc.designPatterns.singleton;

/**
 * Created by jeremie on 16/09/16.
 */
public class MainSingleton {

    public static void main (String[] args) {
        Initializer i = new Initializer();
        User u = new User();

        i.doSomething();
        u.doSomething();
    }
}
