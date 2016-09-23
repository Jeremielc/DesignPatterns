package com.ensicaen.jeremielc.designPatterns.state;

/**
 * Created by jeremie on 23/09/16.
 */
public class HalfAuthenticated implements IPopState {

    private PopServer ps;

    public HalfAuthenticated(PopServer ps) {
        this.ps = ps;
    }

    @Override
    public boolean user(String username) {
        System.out.println("User already identified.");
        return false;
    }

    @Override
    public boolean pass(String password) {
        if (password != null && !password.isEmpty()) {
            System.out.println("Authentication OK !");
            ps.setPassword(password);
            return true;
        } else {
            System.out.println("Authentication NOK !");
            return false;
        }
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
        ps.setUsername("");
        ps.setPassword("");
        System.out.println("Deconnexion OK");
        return true;
    }
}
