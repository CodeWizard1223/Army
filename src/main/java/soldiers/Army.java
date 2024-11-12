package soldiers;

import abilities.Defensive;
import abilities.Offensive;
import offensive.Knight;

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
            if (soldier instanceof Offensive) {
                ((Offensive) soldier).attack();
            }
        }
    }

    public void commandDefend() {
        System.out.println("\n-------DEFEND--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Defensive) {
                ((Defensive) soldier).defend();
            }
        }
    }

    public void commandFuryAttack() {
        System.out.println("\n-------FURY ATTACK--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Offensive) {
                ((Offensive) soldier).furyAttack();
            }
        }
    }

    public void commandFireDefend() {
        System.out.println("\n-------FIRE DEFEND--------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Defensive) {
                ((Defensive) soldier).fireDefend();
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
