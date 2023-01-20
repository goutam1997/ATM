package service;

import exception.NotImplementedException;
import model.OptionEnum;
import operation.CashWithdrawalOperation;
import operation.ChangePinOperation;
import operation.CheckBalanceOperation;

public class OperationFactory {
    public Operation getOperation(OptionEnum option) {
        if (OptionEnum.CHECK_BALANCE.equals(option)) {
            return new CheckBalanceOperation();
        } else if (OptionEnum.CASH_WITHDRAWL.equals(option)) {
            return new CashWithdrawalOperation();
        } else if (OptionEnum.CHANGE_PIN.equals(option)) {
            return new ChangePinOperation();
        } else {
            throw new NotImplementedException();
        }
    }
}
