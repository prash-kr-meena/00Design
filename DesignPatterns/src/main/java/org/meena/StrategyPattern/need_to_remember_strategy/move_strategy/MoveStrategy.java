package org.meena.StrategyPattern.need_to_remember_strategy.move_strategy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public abstract class MoveStrategy {

  @Getter
  String strategyName;

  public MoveStrategy(String strategyName) {
    this.strategyName = strategyName;
  }

  public abstract void move(String name);
}
