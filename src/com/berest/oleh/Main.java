package com.berest.oleh;

import com.berest.oleh.arrays.Array;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run(){
        int []mas = {2, 7};
        Array obj2 = new Array(mas);
        System.out.println("Max element of massiv:" + obj2.findMaxElement());
    }
}
