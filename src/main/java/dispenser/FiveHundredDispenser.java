package dispenser;

import model.ATM;
import model.Denomination;

public class FiveHundredDispenser extends RupeesDispenser{
    public FiveHundredDispenser(RupeesDispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void dispense(ATM atm, int amountToDispense) {
        int remainingAmount = super.dispenseNotesAndReturnRemainingAmount(amountToDispense, Denomination.FIVE_HUNDRED);
        if (remainingAmount > 0) {
            super.dispense(atm, remainingAmount);
        }
    }
}
