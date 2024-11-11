package soldiers;

public class Swordsman extends Soldier{

    public Swordsman(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - " + this.type);
    }

    @Override
    public void useAbility() {
        System.out.println("Swordsman " + name + " deals " + damage + " damage.");
    }
}
