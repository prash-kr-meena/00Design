package org.meena.StrategyPattern.need_to_remember_strategy.move_strategy;

public abstract class MoveStrategy {

  String strategyName;

  public MoveStrategy(String strategyName) {
    this.strategyName = strategyName;
  }

  public abstract void move(String name);
}
