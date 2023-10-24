package ru.geekbrains.lesson7.observer;

public class Master implements Observer{

    private String name;
    private int salary;
    
    private VacancyType[] appropriateVacancies;

    public Master(String name) {
        this.name = name;
        this.setSalary(80000);
        this.setAppropriateVacancies(new VacancyType[]{VacancyType.Handyman, VacancyType.Plumber, VacancyType.Engineer});
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    @Override
    public boolean fit(VacancyType type)
    {
        for(VacancyType vtype:this.appropriateVacancies)
        {
            if (type == vtype) return true;
        }
        return false;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (fit(vacancy.getType()))
        {
            if (this.salary <= vacancy.getSalary()){
                System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s)\n",
                    name, nameCompany, vacancy);
                this.salary = vacancy.getSalary();
            } else {
                System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s)\n",
                    name, nameCompany, vacancy);
            }
        } else {
            System.out.printf("Специалист %s: Я не могу работать по этой специальности :( (компания: %s; вакансия: %s)\n",
                    name, nameCompany, vacancy);
        }
    }



    @Override
    public void setAppropriateVacancies(VacancyType[] types) {
        //этот тип работника может освоить три профессии
        this.appropriateVacancies = types;
    }

    public String toString()
    {
        String[] v = new String[this.appropriateVacancies.length];
        for(int i=0;i<v.length;i++)
        {
            v[i] = this.appropriateVacancies[i].name();
        }
        return String.format("My appropriate vacancies: %s, my salary: %d",String.join(",",v), this.salary);
    }
}
