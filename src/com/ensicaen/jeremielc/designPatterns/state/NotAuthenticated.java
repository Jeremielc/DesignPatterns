package com.ensicaen.jeremielc.designPatterns.state;

/**
 * Created by jeremie on 23/09/16.
 */
public class NotAuthenticated implements IPopState {

    private PopServer ps;

    public NotAuthenticated(PopServer ps) {
        this.ps = ps;
    }

    @Override
    public boolean user(String username) {
        if (username != null && !username.isEmpty()) {
            System.out.println("Identification OK !");
            ps.setUsername(username);
            return true;
        } else {
            System.out.println("Identification NOK !");
            return false;
        }
    }

    @Override
    public boolean pass(String password) {
        System.out.println("You must enter a valid username.");
        return false;
    }

    @Override
    public void list(int num) {
        System.out.println("You must be authenticated.");
    }

    @Override
    public void retr(int num) {
        System.out.println("You must be authenticated.");
    }

    @Override
    public boolean quit() {
        System.out.println("You must be authenticated.");
        return false;
    }
}
