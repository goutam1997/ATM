package operation;

import dispenser.FiveHundredDispenser;
import dispenser.HundredDispenser;
import dispenser.RupeesDispenser;
import dispenser.TwoThousandDispenser;
import model.ATM;
import model.Card;
import service.Operation;

public class CashWithdrawalOperation implements Operation {
    private static final int AMOUNT_TO_WITHDRAW = 3700;

    @Override
    public void performOperation(ATM atm, Card card) {
        if (AMOUNT_TO_WITHDRAW > card.getAccount().getBalance() || AMOUNT_TO_WITHDRAW > atm.getAtmBalance()) {
            System.out.println("Insufficient Balance");
            return;
        }
        RupeesDispenser rupeesDispenser = new TwoThousandDispenser(new FiveHundredDispenser(
                new HundredDispenser(null)));
        rupeesDispenser.dispense(atm, AMOUNT_TO_WITHDRAW);
        atm.deductAmount(AMOUNT_TO_WITHDRAW);
        card.getAccount().withdrawAmount(AMOUNT_TO_WITHDRAW);
    }
}
