package soldiers;

public class Spearman extends Soldier {
    public Spearman(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void useAbility() {
        System.out.println("Spearman " + name + " deals " + damage + " damage.");
    }


}
