package soldiers;

public class Berserk extends Soldier{

    public Berserk(String name, int damage, SoldierType type) {
        super(name, damage, type);
    }

    @Override
    public void report() {
        System.out.println("Soldier " + name + " here. Type - " + this.type);
    }

    @Override
    public void useAbility() {
        System.out.println("Berserk " + name + " deals " + damage + " damage.");
    }
}
