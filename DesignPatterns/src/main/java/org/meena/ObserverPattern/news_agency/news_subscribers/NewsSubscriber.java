package org.meena.ObserverPattern.news_agency.news_subscribers;


import lombok.Data;
import org.meena.ObserverPattern.abstraction.Observer;
import org.meena.ObserverPattern.news_agency.news_publisher.NewsPublisher;

@Data
public abstract class NewsSubscriber implements Observer {

  private NewsPublisher publisher;

  public NewsSubscriber(NewsPublisher publisher) {
    this.publisher = publisher;
  }

  // Not Providing Implementation
  public abstract void update();
}
