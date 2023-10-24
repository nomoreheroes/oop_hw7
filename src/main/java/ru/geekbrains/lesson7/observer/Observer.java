package ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, Vacancy vacancy);
    boolean fit(VacancyType type);
    void setAppropriateVacancies(VacancyType[] types);
}
