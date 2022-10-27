package ru.job4j.poly;

public interface Transport {
    void drive();

    void passCount(int count);

    double priceFuel(double fuelCount);
}
