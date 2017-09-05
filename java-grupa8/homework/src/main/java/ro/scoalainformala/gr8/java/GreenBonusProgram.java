package ro.scoalainformala.gr8.java;

public class GreenBonusProgram {
    private int fixBudget = 10000000;
    private int budget = 0;
    private BonusReceived[] history = new BonusReceived[1000];
    private int bonusNumber = 0;

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
    public void getGreenBonus(BonusReceived bonus) {
        history[bonusNumber].add(bonus);
        bonusNumber++;
        budget += 10000;
    }
}

