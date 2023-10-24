package ru.geekbrains.lesson7.singleton;

public class Settings {

    private static Settings instance;

    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();

            //TODO: Получим настройки, проинициализируем поля объекта

        }

        return instance;
    }

    private Settings(){

    }

    private String param1;

    private int param2;

    private boolean param3;

}
