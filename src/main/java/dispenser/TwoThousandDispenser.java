package dispenser;

import model.ATM;
import model.Denomination;

public class TwoThousandDispenser extends RupeesDispenser{
    public TwoThousandDispenser(RupeesDispenser nextDispenser) {
        super(nextDispenser);
    }

    @Override
    public void dispense(ATM atm, int amountToDispense) {
        int remainingAmount = super.dispenseNotesAndReturnRemainingAmount(amountToDispense, Denomination.TWO_THOUSAND);
        if (remainingAmount > 0) {
            super.dispense(atm, remainingAmount);
        }
    }
}
