package com.pluralsight;

public class ForLoop {


    public static void main(String[] args) throws InterruptedException{

        //add for loop
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            //super cool counts it down pretty cool
            Thread.sleep(1000);

        }
        System.out.println("LAUNCH!");
    }
}
