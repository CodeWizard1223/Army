package sk.malajter.soldier.offensive;

import sk.malajter.ability.Offensive;
import sk.malajter.soldier.Soldier;
import sk.malajter.SoldierType;

public class Knight extends Soldier implements Offensive {
    public Knight(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void attack() {
        System.out.println("Knight " + name + " deals " + damage + " damage.");    }

    @Override
    public void furyAttack() {
        System.out.println("Knight " + name + " deals " + damage + " damage.");
    }

    public void commandFlank() {
        System.out.println("Knight " + name + " is flanking.");
    }
}