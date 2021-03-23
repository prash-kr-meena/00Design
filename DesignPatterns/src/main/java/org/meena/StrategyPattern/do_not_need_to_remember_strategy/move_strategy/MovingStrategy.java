package org.meena.StrategyPattern.do_not_need_to_remember_strategy.move_strategy;

import lombok.Getter;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.AggressiveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.DefensiveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.MoveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.NormalStrategy;


public enum MovingStrategy {

  AGGRESSIVE(new AggressiveStrategy("AGGRESSIVELY")),
  DEFENSIVE(new DefensiveStrategy("DEFENSIVELY")),
  NORMAL(new NormalStrategy("NORMALLY"));

  @Getter
  MoveStrategy strategy;

  MovingStrategy(MoveStrategy strategy) {
    this.strategy = strategy;
  }

}
