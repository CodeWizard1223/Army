package soldiers;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<Soldier> soldiers = new ArrayList<>();

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void commandReport() {
        System.out.println("\n-------REPORT--------");
        for (Soldier soldier : soldiers) {
            soldier.report();
        }
    }

    public void commandAttack() {
        System.out.println("\n-------ATTACK--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Swordsman || soldier instanceof Berserk || soldier instanceof Knight) {
                soldier.useAbility();
            }
        }
    }

    public void commandDefend() {
        System.out.println("\n-------DEFEND--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Archer || soldier instanceof Spearman || soldier instanceof Swordsman) {
                soldier.useAbility();
            }
        }
    }

    public void commandFuryAttack() {
        System.out.println("\n-------FURY ATTACK--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Knight || soldier instanceof Swordsman || soldier instanceof Berserk) {
                soldier.useAbility();
            }
        }
    }

    public void commandFireDefend() {
        System.out.println("\n-------FIRE DEFEND--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Swordsman || soldier instanceof Spearman || soldier instanceof Archer) {
                soldier.useAbility();
            }
        }
    }

    public void commandFlank() {
        System.out.println("\n-------FLANK--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Knight) {
                ((Knight) soldier).commandFlank();
            }
        }
    }
}
