package com.solid.DIP;

public class DesktopComputer implements Computer {

    private final Monitor monitor;

    public DesktopComputer(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void display() {
        monitor.display();
    }

}
