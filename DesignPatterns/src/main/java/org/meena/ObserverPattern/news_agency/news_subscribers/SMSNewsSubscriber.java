package org.meena.ObserverPattern.news_agency.news_subscribers;


import org.meena.ObserverPattern.news_agency.news_publisher.NewsPublisher;

public class SMSNewsSubscriber extends NewsSubscriber {

  public SMSNewsSubscriber(NewsPublisher publisher) {
    super(publisher);
  }

  public void update() {
    System.out.println("News updated for " + SMSNewsSubscriber.class.getSimpleName()
        + " -> " + this.getPublisher().getNews());
  }
}
