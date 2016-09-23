package com.ensicaen.jeremielc.designPatterns.state;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by jeremie on 23/09/16.
 */
public class Client {

    public Client() {

    }

    public static void main(String[] args) {
        PopServer ps = new PopServer();

        ps.list(-1);

        ps.user("jeremie");
        ps.list(-1);

        ps.user("jeremie");
        ps.pass("coucou");
        ps.list(-1);
        ps.retr(-1);
        ps.quit();

        ps.retr(-1);
    }
}
