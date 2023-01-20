package atm_state;

import model.ATM;
import model.Card;

public class HasCardState extends ATMState{
    private static final int ATM_PIN = 1234;

    @Override
    public void validatePin(ATM atm, Card card) {
        if (ATM_PIN == card.getPin()) {
            atm.setAtmState(new SelectionState());
        } else {
            System.out.println("Invalid pin entered!!!");
            exitATM(atm);
        }
    }
}
