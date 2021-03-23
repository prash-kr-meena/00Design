package org.meena.ObserverPattern.news_agency.news_publisher;


import java.util.ArrayList;
import java.util.List;
import org.meena.ObserverPattern.abstraction.Observable;
import org.meena.ObserverPattern.abstraction.Observer;

public abstract class NewsPublisher implements Observable {

  private final List<Observer> observers;
  private String news;


  public NewsPublisher() {
    this.observers = new ArrayList<Observer>();
  }


  public void registerObservers(Observer observer) {
    observers.add(observer);
  }

  public void unregisterObservers(Observer observer) {
    observers.remove(observer); // O(n)
    // We could implement it using Map, but client would need to put in key
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }


  public String getNews() {
    return news;
  }

  public void setNews(String news) {
    this.news = news;
    this.notifyObservers();
  }
}
