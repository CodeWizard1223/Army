package soldiers;

public class Knight extends Soldier {
    public Knight(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - " + this.type);
    }

    @Override
    public void useAbility() {
        System.out.println("Knight " + name + " deals " + damage + " damage.");
    }

    public void commandFlank() {
        System.out.println("Knight " + name + " is flanking.");
    }
}