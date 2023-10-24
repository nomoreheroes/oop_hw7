package ru.geekbrains.lesson7.observer;

public class Plumber extends Master implements Observer {
   
    public Plumber(String name) {
        super(name);
        this.setSalary(20000);
        this.setAppropriateVacancies(new VacancyType[]{VacancyType.Plumber});
    }

}
