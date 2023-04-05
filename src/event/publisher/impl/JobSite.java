package event.publisher.impl;

import event.observer.Observer;
import event.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Publisher {
    private final List<Observer> observers;
    private final List<String> vacancies;

    public JobSite() {
        this.observers = new ArrayList<>();
        this.vacancies = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(List<Observer> observers) {
        for (Observer observer : observers) {
            observer.handleEvent(vacancies);
        }
    }

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notify(observers);
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notify(observers);
    }
}
