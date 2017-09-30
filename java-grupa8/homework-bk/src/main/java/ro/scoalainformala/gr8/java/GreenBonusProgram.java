package ro.scoalainformala.gr8.java;

import java.util.ArrayList;

public class GreenBonusProgram {
    private static final int fixBudget = 10000000;
    private static int budget = 0;
    private ArrayList<BonusReceived> history = new ArrayList<BonusReceived>();

    /**
     * Check if the Green Bonus Program have enough money to give an bonus;
     *
     * @return true if it is enough money or false if is not;
     */
    public boolean checkFoundsEnough() {
        if (fixBudget > budget) {
            return true;
        }
        return false;
    }

    /**
     * Each time when an bonus is receive is recorded in order to don't exceed the fixBonus value;
     *
     * @param bonus the data of the customer / dealer/ manufacturer which receive the bonus;
     */
    public int getGreenBonus(BonusReceived bonus) {
        history.add(bonus);
        budget += 10000;
        return 10000;
    }
}

