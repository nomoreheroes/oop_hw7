package ru.geekbrains.lesson7.adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {

    int getId(); // Уникальный идентификатор датчика

    LocalDateTime getDateTime(); // Дата и время

    double getTemperature(); // Средняя температура

    double getHumidity(); // Влажность

    double getPressure(); // Давление

}
