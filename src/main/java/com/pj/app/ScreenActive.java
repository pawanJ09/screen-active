package com.pj.app;

import java.awt.*;
import java.util.Random;

/**
 * This program will move the mouse pointer at provided interval and prevent the computer from
 * sleeping.
 *
 * @author - Pawan Jaiswal
 *
 */
public class ScreenActive {

    public static void main( String[] args ) throws Exception {
        Robot hal = new Robot();
        Random random = new Random();
        while (true){
            hal.delay(1000 * 60);
            Point pObj = MouseInfo.getPointerInfo().getLocation();
            hal.mouseMove(pObj.x, pObj.y);
        }
    }
}
