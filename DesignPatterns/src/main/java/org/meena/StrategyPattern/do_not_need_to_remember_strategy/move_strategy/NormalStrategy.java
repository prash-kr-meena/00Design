package org.meena.StrategyPattern.do_not_need_to_remember_strategy.move_strategy;

public class NormalStrategy implements MoveStrategy {
    public void move(String name) {
        System.out.println(name + " Robot is : Moving Normally");
    }
}
