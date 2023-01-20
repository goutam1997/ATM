package model;

import atm_state.ATMState;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    private static ATM atmInstance = null;
    private static Map<Denomination, Integer> denominationNotesMap = new HashMap<>();

    private ATMState atmState;
    private int atmBalance;

    private ATM() {}

    public static ATM getInstance() {
        if (atmInstance == null) {
            atmInstance = new ATM();
        }
        return atmInstance;
    }

    public static Map<Denomination, Integer> getDenominationNotesMap() {
        return denominationNotesMap;
    }

    public static void setDenominationNotesMap(Map<Denomination, Integer> denominationNotesMap) {
        ATM.denominationNotesMap = denominationNotesMap;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public void deductAmount(int amountToWithdraw) {
        atmBalance -= amountToWithdraw;
    }
}
