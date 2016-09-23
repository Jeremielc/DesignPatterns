package com.ensicaen.jeremielc.designPatterns.state;

/**
 * Created by jeremie on 23/09/16.
 */
public class FullyAuthenticated implements IPopState {

    private final PopServer ps;

    public FullyAuthenticated(PopServer ps) {
        this.ps = ps;
    }

    @Override
    public boolean user(String username) {
        System.out.println("User already authenticated.");
        return false;
    }

    @Override
    public boolean pass(String password) {
        System.out.println("User already authenticated.");
        return false;
    }

    @Override
    public void list(int num) {
        if (num < 0) {
            System.out.println("List of messages.");
        } else {
            System.out.println("List message " + num);
        }
    }

    @Override
    public void retr(int num) {
        if (num < 0) {
            System.out.println("Retrieve all messages.");
        } else {
            System.out.println("Retrive message " + num);
        }
    }

    @Override
    public boolean quit() {
        ps.setPassword("");
        ps.setUsername("");
        System.out.println("Deconnexion OK");
        return true;
    }
}
