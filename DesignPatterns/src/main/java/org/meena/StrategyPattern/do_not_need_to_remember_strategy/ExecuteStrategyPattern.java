package org.meena.StrategyPattern.do_not_need_to_remember_strategy;


import org.meena.StrategyPattern.do_not_need_to_remember_strategy.move_strategy.MovingStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.Robot;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.AggressiveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.DefensiveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.MoveStrategy;
import org.meena.StrategyPattern.need_to_remember_strategy.move_strategy.NormalStrategy;

public class ExecuteStrategyPattern {

  public static void main(String[] args) throws Exception {
    MoveStrategy aggressively = MovingStrategy.AGGRESSIVE.getStrategy();
    MoveStrategy defensively = MovingStrategy.DEFENSIVE.getStrategy();
    MoveStrategy normally = MovingStrategy.NORMAL.getStrategy();

    //  Just by having @ToString annotation, at the base class prints the child class as well
    System.out.println(aggressively);
    System.out.println(defensively);
    System.out.println(normally);
    System.out.println();

    // ########################################################

    Robot bigRobot = new Robot("Big Robot", aggressively);
    Robot R2 = new Robot("R2", normally);
    Robot george = new Robot("George v.2.1", defensively);

    bigRobot.move();
    R2.move();
    george.move();

    System.out.println("\nNew behaviours: ");

    // You can update the strategy as well
    bigRobot.setMoveStrategy(aggressively);
    george.setMoveStrategy(aggressively);

    bigRobot.move();
    george.move();
  }
}
