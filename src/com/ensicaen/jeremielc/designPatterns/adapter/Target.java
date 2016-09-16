package com.ensicaen.jeremielc.designPatterns.adapter;

/**
 * Created by jeremie on 16/09/16.
 */
public class Target implements IFormater {

    String s = "Chaine de caractère";
    int format = 1;
    int doNotFormat = 0;

    public Target() {
        System.out.println(format(s, format));
    }

    public String format(String data, int format) {
        Adapter a = new Adapter();
        return a.format(data, format);
    }
}
