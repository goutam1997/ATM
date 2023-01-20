package atm_state;

import model.ATM;
import model.Card;
import model.OptionEnum;

public class SelectionState extends ATMState{
    @Override
    public OptionEnum selectOperation(ATM atm, Card card) {
        atm.setAtmState(new PerformOperationState());
        return OptionEnum.CASH_WITHDRAWL;
    }
}
