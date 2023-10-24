package ru.geekbrains.lesson7.adapter;

import java.time.LocalDateTime;
import java.util.Random;

public class MS200 implements MeteoSensor {

    private static Random random = new Random();
    private int id;

    {
        id = random.nextInt(1000, 9999);
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    @Override
    public double getTemperature() {
        return 23;
    }

    @Override
    public double getHumidity() {
        return 60;
    }

    @Override
    public double getPressure() {
        return 752.4;
    }
}
