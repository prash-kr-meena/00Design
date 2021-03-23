package org.meena.ObserverPattern.abstraction;

public interface Observable {

    void registerObservers(Observer observer);

    void unregisterObservers(Observer observer);

    void notifyObservers();
}
