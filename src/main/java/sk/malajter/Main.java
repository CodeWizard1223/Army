package sk.malajter;
import sk.malajter.soldier.adaptable.Swordsman;
import sk.malajter.soldier.defensive.Archer;
import sk.malajter.soldier.defensive.Berserk;
import sk.malajter.soldier.defensive.Spearman;
import sk.malajter.soldier.offensive.Knight;

public class Main {
    public static void main(String[] args) {

        Army army = new Army();

        army.addSoldier(new Knight("Knight 1", 5, SoldierType.OFFENSIVE));
        army.addSoldier(new Knight("Knight 2", 5, SoldierType.OFFENSIVE));
        army.addSoldier(new Knight("Knight 3", 5, SoldierType.OFFENSIVE));
        army.addSoldier(new Archer("Archer 1", 2, SoldierType.DEFENSIVE));
        army.addSoldier(new Archer("Archer 2", 2, SoldierType.DEFENSIVE));
        army.addSoldier(new Archer("Archer 3", 2, SoldierType.DEFENSIVE));
        army.addSoldier(new Spearman("Spearman 1", 4, SoldierType.DEFENSIVE));
        army.addSoldier(new Spearman("Spearman 2", 4, SoldierType.DEFENSIVE));
        army.addSoldier(new Berserk("berserk", 6, SoldierType.DEFENSIVE));
        army.addSoldier(new Swordsman("Swordsman 1", 3, SoldierType.ADAPTABLE));
        army.addSoldier(new Swordsman("Swordsman 2", 3, SoldierType.ADAPTABLE));

        army.commandReport();
        army.commandAttack();
        army.commandDefend();
        army.commandFuryAttack();
        army.commandFireDefend();
        army.commandFlank();
    }
}