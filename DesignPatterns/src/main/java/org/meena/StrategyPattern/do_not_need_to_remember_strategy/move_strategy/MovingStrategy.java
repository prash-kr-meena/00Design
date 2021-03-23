package org.meena.StrategyPattern.do_not_need_to_remember_strategy.move_strategy;

import lombok.Getter;


public enum MovingStrategy {

  AGGRESSIVE(new AggressiveStrategy()),
  DEFENSIVE(new DefensiveStrategy()),
  NORMAL(new NormalStrategy());

  @Getter
  MoveStrategy strategy;

  MovingStrategy(MoveStrategy strategy) {
    this.strategy = strategy;
  }

}
