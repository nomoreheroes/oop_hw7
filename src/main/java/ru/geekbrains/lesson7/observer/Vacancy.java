package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Vacancy {
   private int salary;
   private VacancyType type;
   private Random random = new Random();

   public Vacancy()
   {
        this.type = VacancyType.values()[random.nextInt(VacancyType.values().length)];
        this.salary = switch(type)
        {
            case Plumber -> { yield 10000 + random.nextInt(40000);}
            case Handyman -> {yield 1000 + random.nextInt(49000);}
            case Engineer -> {yield 20000 + random.nextInt(80000);}
            case SoftwareDeveloper -> {yield 100000 + random.nextInt(100000);}
            case QAEngineer -> {yield 50000 + random.nextInt(100000);}
            case Doctor -> {yield 20000 + random.nextInt(480000);}
        };
   }

    /**
     * @return int return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @return VacancyType return the type
     */
    public VacancyType getType() {
        return type;
    }

    public String toString()
    {
        return String.format("%s (заработная плата %d)",this.type,this.salary);
    }
}