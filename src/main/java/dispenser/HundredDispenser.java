package dispenser;

import model.ATM;
import model.Denomination;

public class HundredDispenser extends RupeesDispenser{
    public HundredDispenser(RupeesDispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void dispense(ATM atm, int amountToDispense) {
        int remainingAmount = super.dispenseNotesAndReturnRemainingAmount(amountToDispense, Denomination.HUNDRED);
        if (remainingAmount > 0) {
            super.dispense(atm, remainingAmount);
        }
    }
}
