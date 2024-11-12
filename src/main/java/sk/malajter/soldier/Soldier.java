package sk.malajter.soldier;

import sk.malajter.SoldierType;

public abstract class Soldier {
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
}
