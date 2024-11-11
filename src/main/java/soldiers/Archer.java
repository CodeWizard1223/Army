package soldiers;

public class Archer extends Soldier {
    public Archer(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void useAbility() {
        System.out.println("Archer " + name + " deals " + damage + " damage.");

    }
}
