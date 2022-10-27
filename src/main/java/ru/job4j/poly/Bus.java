package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Жми на газ, когда валит наш любимый таз!");
    }

    @Override
    public void passCount(int count) {
        int pass = count;
    }

    @Override
    public double priceFuel(double fuelCount) {
        double volumeFuel = 52.5;
        return fuelCount * volumeFuel;
    }
}
