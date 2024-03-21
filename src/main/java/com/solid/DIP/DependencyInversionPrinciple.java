package com.solid.DIP;

public class DependencyInversionPrinciple {

    public static void main(String[] args) {

        Monitor monitor = new LEDMonitor();

        Computer computer = new DesktopComputer(monitor);
        computer.display();

    }

}
