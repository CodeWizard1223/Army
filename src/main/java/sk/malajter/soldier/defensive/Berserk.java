package sk.malajter.soldier.defensive;

import sk.malajter.ability.Offensive;
import sk.malajter.soldier.Soldier;
import sk.malajter.SoldierType;

public class Berserk extends Soldier implements Offensive {

    public Berserk(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void attack() {
        System.out.println("Berserk " + name + " deals " + (damage / 2) + " damage.");
    }

    @Override
    public void furyAttack() {
        System.out.println("Berserk " + name + " deals " + damage + " damage.");
    }
}
