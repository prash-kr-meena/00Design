package org.meena.StrategyPattern.need_to_remember_strategy.move_strategy;

public class DefensiveStrategy extends MoveStrategy {

  public DefensiveStrategy(String strategyName) {
    super(strategyName);
  }

  public void move(String name) {
    System.out.println(name + " Robot is : Moving " + this.strategyName);
  }
}
