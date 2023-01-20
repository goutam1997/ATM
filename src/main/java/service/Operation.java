package service;

import model.ATM;
import model.Card;

public interface Operation {
    void performOperation(ATM atm, Card card);
}
