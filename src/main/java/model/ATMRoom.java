package model;

import atm_state.IdleState;

import java.util.HashMap;
import java.util.Map;

public class ATMRoom {
    private ATM atm;
    private User user;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user);
        atmRoom.atm.getAtmState().validatePin(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getAtmState().performOperation(atmRoom.atm, atmRoom.user.getCard(), OptionEnum.CASH_WITHDRAWL);
    }

    private void initialize() {
        this.user = createNewUser();
        this.atm = ATM.getInstance();
        Map<Denomination, Integer> denominationNotesMap = new HashMap<>();
        denominationNotesMap.put(Denomination.TWO_THOUSAND, 2);
        denominationNotesMap.put(Denomination.FIVE_HUNDRED, 2);
        denominationNotesMap.put(Denomination.HUNDRED, 10);
        ATM.setDenominationNotesMap(denominationNotesMap);
        this.atm.setAtmBalance(6000);
        this.atm.setAtmState(new IdleState());
    }

    private static User createNewUser() {
        User user = new User();
        BankAccount bankAccount = new BankAccount(4000);
        user.setCard(new Card(1234, bankAccount));
        user.setBankAccount(bankAccount);
        return user;
    }
}
