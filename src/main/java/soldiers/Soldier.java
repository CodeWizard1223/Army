package soldiers;

import sk.malajter.Ability;

public abstract class Soldier implements Ability{
    protected String name;
    protected int damage;
    protected SoldierType type;

    public Soldier(String name, int damage, SoldierType type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public void report() {
        System.out.println("Soldier " + name + " here. Type - " + type);
    }

    @Override
    public abstract void useAbility();
}
