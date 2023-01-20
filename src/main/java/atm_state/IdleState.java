package atm_state;

import model.ATM;
import model.Card;
import model.User;

public class IdleState extends ATMState{
    @Override
    public Card insertCard(ATM atm, User user) {
        Card card = user.getCard();
        System.out.println("Card inserted!!!");
        atm.setAtmState(new HasCardState());
        return card;
    }
}
