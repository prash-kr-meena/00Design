package org.meena.StrategyPattern.do_not_need_to_remember_strategy;


import org.meena.StrategyPattern.do_not_need_to_remember_strategy.move_strategy.MovingStrategy;

public class ExecuteStrategyPattern {

  public static void main(String[] args) {

    Robot bigRobot = new Robot("Big Robot");
    Robot george = new Robot("George v.2.1");
    Robot R2 = new Robot("R2");

    bigRobot.move(MovingStrategy.AGGRESSIVE.getStrategy());
    george.move(MovingStrategy.DEFENSIVE.getStrategy());
    R2.move(MovingStrategy.NORMAL.getStrategy());

    System.out.println("\nNew behaviours: " +
        "\n'Big Robot' gets really scared" +
        "\n,'George v.2.1' becomes really mad because" +
        "it's always attacked by other robots" +
        "\n and R2 keeps its calm\n");

    bigRobot.move(MovingStrategy.AGGRESSIVE.getStrategy());
    george.move(MovingStrategy.AGGRESSIVE.getStrategy());
  }
}
