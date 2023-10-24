package ru.geekbrains.lesson7.observer;

public class Student extends Master implements Observer{
    public Student(String name) {
        super(name);
        this.setSalary(10000);
        this.setAppropriateVacancies(new VacancyType[]{VacancyType.Handyman,VacancyType.QAEngineer});
    }
}
