package com.ensicaen.jeremielc.designPatterns.state;

/**
 * Created by jeremie on 23/09/16.
 */
public class PopServer implements IPopState {

    private IPopState popState;
    private String username;
    private String password;

    public PopServer() {
        popState = new NotAuthenticated(this);
    }

    @Override
    public boolean user(String username) {
        boolean ret = popState.user(username);

        if (ret) {
            popState = new HalfAuthenticated(this);
        }

        return ret;
    }

    @Override
    public boolean pass(String password) {
        boolean ret = popState.pass(password);

        if (ret) {
            popState = new FullyAuthenticated(this);
        }

        return ret;
    }

    @Override
    public void list(int num) {
        popState.list(num);
    }

    @Override
    public void retr(int num) {
        popState.retr(num);
    }

    @Override
    public boolean quit() {
        boolean ret = popState.quit();

        if (ret) {
            popState = new NotAuthenticated(this);
        }

        return ret;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
