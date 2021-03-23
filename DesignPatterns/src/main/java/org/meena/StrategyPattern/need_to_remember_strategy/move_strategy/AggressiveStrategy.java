package org.meena.StrategyPattern.need_to_remember_strategy.move_strategy;

public class AggressiveStrategy extends MoveStrategy {


  public AggressiveStrategy(String strategyName) {
    super(strategyName);
  }

  public void move(String name) {
    System.out.println(name + " Robot is : Moving Aggressively");
  }
}
