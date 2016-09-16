package com.ensicaen.jeremielc.designPatterns.adapter;

/**
 * Created by jeremie on 16/09/16.
 */
public class Adaptee {

    public Adaptee() {

    }

    public String format(int format, String data) {
        if (format == 1) {
            return data.replaceAll(" ", "_");
        } else {
            return data;
        }
    }
}
