package org.meena.StrategyPattern.need_to_remember_strategy;


import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.AggressiveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.DefensiveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.MoveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.NormalStrategy;

public class ExecuteStrategyPattern {

  public static void main(String[] args) throws Exception {
    MoveStrategy aggressively = new AggressiveStrategy("AGGRESSIVELY");
    MoveStrategy defensively = new DefensiveStrategy("DEFENSIVELY");
    MoveStrategy normally = new NormalStrategy("NORMALY");

    Robot bigRobot = new Robot("Big Robot", aggressively);
    Robot R2 = new Robot("R2", normally);
    Robot george = new Robot("George v.2.1", defensively);

    System.out.println("\nNew behaviours: " +
        "\n'Big Robot' gets really scared" +
        "\n,'George v.2.1' becomes really mad because" +
        "it's always attacked by other robots" +
        "\n and R2 keeps its calm\n");

    // You can update the strategy as well
    bigRobot.updateMoveStrategy(aggressively);
    george.updateMoveStrategy(aggressively);

    bigRobot.move();
    george.move();
  }
}
