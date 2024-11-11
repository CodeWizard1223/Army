package soldiers;

public class Archer extends Soldier {
    public Archer(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - " + this.type);
    }

    @Override
    public void useAbility() {
        System.out.println("Archer " + name + " deals " + damage + " damage.");

    }
}
