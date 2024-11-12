package adaptable;

import abilities.Defensive;
import abilities.Offensive;
import soldiers.Soldier;
import soldiers.SoldierType;

public class Swordsman extends Soldier implements Offensive, Defensive {

    public Swordsman(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void defend() {
        System.out.println("Swordsman " + name + " deals " + damage + " damage.");
    }

    @Override
    public void fireDefend() {
        System.out.println("Swordsman " + name + " deals " + damage + " damage.");
    }

    @Override
    public void attack() {
        System.out.println("Swordsman " + name + " deals " + damage + " damage.");
    }

    @Override
    public void furyAttack() {
        System.out.println("Swordsman " + name + " deals " + damage + " damage.");
    }
}
