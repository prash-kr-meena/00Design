package org.meena.ObserverPattern.news_agency.news_subscribers;


import org.meena.ObserverPattern.news_agency.news_publisher.NewsPublisher;

public class EmailNewsSubscriber extends NewsSubscriber {

  public EmailNewsSubscriber(NewsPublisher publisher) {
    super(publisher);
  }

  public void update() {
    System.out.println("News updated for " + EmailNewsSubscriber.class.getSimpleName()
        + " -> " + this.getPublisher().getNews());
  }
}
