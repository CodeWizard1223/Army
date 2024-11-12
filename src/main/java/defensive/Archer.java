package defensive;

import abilities.Defensive;
import soldiers.Soldier;
import soldiers.SoldierType;

public class Archer extends Soldier implements Defensive {
    public Archer(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void defend() {
        System.out.println("Archer " + name + " deals " + damage + " damage.");
    }

    @Override
    public void fireDefend() {
        System.out.println("Archer " + name + " deals " + (damage * 2) + " damage.");
    }
}
