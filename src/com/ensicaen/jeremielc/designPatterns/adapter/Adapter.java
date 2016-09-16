package com.ensicaen.jeremielc.designPatterns.adapter;

/**
 * Created by jeremie on 16/09/16.
 */
public class Adapter implements IFormater {

    public Adapter() {

    }

    public String format(String data, int format) {
        Adaptee a = new Adaptee();
        return a.format(format, data);
    }
}
