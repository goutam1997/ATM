package atm_state;

import model.ATM;
import model.Card;
import model.OptionEnum;
import service.Operation;
import service.OperationFactory;

public class PerformOperationState extends ATMState{
    private OperationFactory factory;

    @Override
    public void performOperation(ATM atm, Card card, OptionEnum option) {
        factory = new OperationFactory();
        Operation operation = factory.getOperation(option);
        operation.performOperation(atm, card);
        exitATM(atm);
    }
}
