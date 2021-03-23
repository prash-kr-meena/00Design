package org.meena.ObserverPattern.news_agency;


import org.meena.ObserverPattern.news_agency.news_publisher.BollywoodNewsPublisher;
import org.meena.ObserverPattern.news_agency.news_publisher.SportsNewsPublisher;
import org.meena.ObserverPattern.news_agency.news_subscribers.EmailNewsSubscriber;
import org.meena.ObserverPattern.news_agency.news_subscribers.InstagramFeedNewsSubscriber;
import org.meena.ObserverPattern.news_agency.news_subscribers.SMSNewsSubscriber;

public class RunNewsAgency {

  public static void main(String[] args) {
    SportsNewsPublisher sportsNewsPublisher = new SportsNewsPublisher();// Publisher
    EmailNewsSubscriber emailNewsSubscriber = new EmailNewsSubscriber(
        sportsNewsPublisher); // Subscriber
    SMSNewsSubscriber smsNewsSubscriber = new SMSNewsSubscriber(sportsNewsPublisher);

    sportsNewsPublisher.registerObservers(emailNewsSubscriber); // Subscribing
    sportsNewsPublisher.registerObservers(smsNewsSubscriber);

    sportsNewsPublisher.setNews("Sports news - Update 1");

    BollywoodNewsPublisher bollywoodNewsPublisher = new BollywoodNewsPublisher();// Publisher
    InstagramFeedNewsSubscriber instagramFeedNewsSubscriber = new InstagramFeedNewsSubscriber(
        bollywoodNewsPublisher);
    bollywoodNewsPublisher.registerObservers(instagramFeedNewsSubscriber);// Subscribing

    bollywoodNewsPublisher.setNews("Bollywood news - Update 1");

    // Some time later
    sportsNewsPublisher.setNews("Sports news - Update 2");
    bollywoodNewsPublisher.setNews("Bollywood news - Update 2");
  }
}
