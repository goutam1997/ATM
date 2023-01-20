package atm_state;

import model.ATM;
import model.Card;
import model.OptionEnum;
import model.User;

public abstract class ATMState {
    public Card insertCard(ATM atm, User user) {
        System.out.println("Invalid operation. Please retry!!!");
        return null;
    }
    public void validatePin(ATM atm, Card card){
        System.out.println("Invalid operation. Please retry!!!");
    }
    public OptionEnum selectOperation(ATM atm, Card card) {
        return null;
    }
    public void performOperation(ATM atm, Card card, OptionEnum option) {
        System.out.println("Invalid operation. Please retry!!!");
    }
    public void exitATM(ATM atm) {
        System.out.println("Please collect your card");
        atm.setAtmState(new IdleState());
    }
}
