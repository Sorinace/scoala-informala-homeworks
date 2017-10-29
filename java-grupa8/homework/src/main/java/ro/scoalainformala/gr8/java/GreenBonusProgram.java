package ro.scoalainformala.gr8.java;

import java.util.ArrayList;

/**
 * @author Sorin
 */
public class GreenBonusProgram {
    private static final int fixBudget = 10_000_000;
    private static int budget = 0;
    private static ArrayList<BonusReceived> history = new ArrayList<BonusReceived>();

    /**
     * Check if the Green Bonus Program have enough money to give an bonus;
     *
     * @return true if it is enough money or false if is not;
     */
    public static synchronized boolean getABonus(BonusReceived bonus) {
        if (fixBudget > budget) {
            history.add(bonus);
            budget += 10_000;
            return true;
        }
        return false;
    }


}

