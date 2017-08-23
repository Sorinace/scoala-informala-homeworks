package ro.scoalainformala.gr8.java;

public class GreenBonusProgram {
    private int fixBudget = 10_000_000;
    private BonusReceived[] history = new BonusReceived[1_000];
    private int bonusNumber = 0;

    public boolean checkFoundsEnough() {
        if (fixBudget > 0) {
            return true;
        }
        return false;
    }

    public void getGreenBonus(BonusReceived bonus) {
        history[bonusNumber].add(bonus);
        bonusNumber++;
        fixBudget -= 10_000;
    }
}

