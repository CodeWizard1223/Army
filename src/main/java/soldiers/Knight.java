package soldiers;

public class Knight extends Soldier {
    public Knight(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void useAbility() {
        System.out.println("Knight " + name + " deals " + damage + " damage.");
    }

    public void commandFlank() {
        System.out.println("Knight " + name + " is flanking.");
    }
}