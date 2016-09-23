package com.ensicaen.jeremielc.designPatterns.state;

/**
 * Created by jeremie on 23/09/16.
 */
public interface IPopState {

    public boolean user(String username);
    public boolean pass(String password);
    public void list(int num);
    public void retr(int num);
    public boolean quit();
}
