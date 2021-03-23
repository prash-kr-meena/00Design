package org.meena.StrategyPattern.need_to_remember_strategy;


import lombok.Data;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.MoveStrategy;

@Data
public class Robot {

  private String name;
  private MoveStrategy moveStrategy;

  public Robot(String name, MoveStrategy moveStrategy) {
    this.name = name;
    this.moveStrategy = moveStrategy;
  }

  public void move() {
    this.moveStrategy.move(this.name);
  }

  public void setMoveStrategy(MoveStrategy moveStrategy) throws Exception {
    if (moveStrategy == null) {
      throw new Exception("Invalid Move Strategy");
    }

    this.moveStrategy = moveStrategy;
    System.out.println("Move Strategy Has Been Updated to "
        + this.moveStrategy.getStrategyName()
        + " Strategy");
  }
}
