package soldiers;

public class Swordsman extends Soldier{

    public Swordsman(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        super.report();
    }

    @Override
    public void useAbility() {
        System.out.println("Swordsman " + name + " deals " + damage + " damage.");
    }
}
