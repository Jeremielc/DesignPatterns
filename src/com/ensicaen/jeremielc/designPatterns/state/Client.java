package com.ensicaen.jeremielc.designPatterns.state;

/**
 * Created by jeremie on 23/09/16.
 */
public class Client {

    public Client() {

    }

    public static void main(String[] args) {
        PopServer ps = new PopServer();

        ps.list(IPopState.ALL_MESSAGES);

        ps.user("jeremie");
        ps.list(IPopState.ALL_MESSAGES);

        ps.user("jeremie");
        ps.pass("password");
        ps.list(IPopState.ALL_MESSAGES);
        ps.retr(IPopState.ALL_MESSAGES);
        ps.quit();

        ps.retr(IPopState.ALL_MESSAGES);
    }
}
