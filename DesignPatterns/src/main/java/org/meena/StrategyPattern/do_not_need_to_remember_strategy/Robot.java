package org.meena.StrategyPattern.do_not_need_to_remember_strategy;


import lombok.Data;
import org.meena.StrategyPattern.do_not_need_to_remember_strategy.move_strategy.MoveStrategy;

@Data
public class Robot {

  private String name;

  public Robot(String name) {
    this.name = name;
  }

  public void move(MoveStrategy moveStrategy) {
    moveStrategy.move(name);
  }
}
