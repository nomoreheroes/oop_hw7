package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private int maxSalary;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        Vacancy vacancy = new Vacancy();
        jobAgency.sendOffer(name, vacancy);
    }

}
