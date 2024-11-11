package soldiers;

public class Spearman extends Soldier {
    public Spearman(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - " + this.type);
    }

    @Override
    public void useAbility() {
        System.out.println("Spearman " + name + " deals " + damage + " damage.");
    }


}
