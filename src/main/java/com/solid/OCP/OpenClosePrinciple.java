package com.solid.OCP;

public class OpenClosePrinciple {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();

        CarWithMusicSystem carWithMusicSystem = new CarWithMusicSystem();
        carWithMusicSystem.start();
        carWithMusicSystem.musicOn();

    }

}
