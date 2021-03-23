package org.meena.ObserverPattern.news_agency.news_subscribers;


import org.meena.ObserverPattern.news_agency.news_publisher.NewsPublisher;

public class InstagramFeedNewsSubscriber extends NewsSubscriber {

  public InstagramFeedNewsSubscriber(NewsPublisher publisher) {
    super(publisher);
  }

  public void update() {
    System.out.println("News updated for " + InstagramFeedNewsSubscriber.class.getSimpleName()
        + " -> " + this.getPublisher().getNews());
  }
}
