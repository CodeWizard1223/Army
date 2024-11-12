package sk.malajter.soldier.defensive;

import sk.malajter.ability.Defensive;
import sk.malajter.soldier.Soldier;
import sk.malajter.SoldierType;

public class Spearman extends Soldier implements Defensive {
    public Spearman(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void defend() {
        System.out.println("Spearman " + name + " deals " + damage + " damage.");
    }

    @Override
    public void fireDefend() {
        System.out.println("Spearman " + name + " deals " + damage + " damage.");
    }
}
