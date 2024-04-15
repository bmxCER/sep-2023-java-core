package hw1.javacore.part1.car;

public class Car {

    private String model;
    private int power;
    private int volumeEngine;
    private boolean turbo;


    public Car(String model, int power, int volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }

    public boolean getTurbo() {
        return turbo;
    }

    @Override
    public String toString() {
        return "Car{model="+ model +", power="+ power +", volumeEngine="+ volumeEngine +", turbo="+ turbo +"}";
    }
}