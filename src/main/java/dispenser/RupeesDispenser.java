package dispenser;

import model.ATM;
import model.Denomination;

public abstract class RupeesDispenser {
    private RupeesDispenser nextDispenser;

    public RupeesDispenser(RupeesDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public void dispense(ATM atm, int amountToDispense) {
        if (nextDispenser != null) {
            nextDispenser.dispense(atm, amountToDispense);
        }
    }

    public int dispenseNotesAndReturnRemainingAmount(int amount, Denomination denomination) {
        int notesRequired = amount / denomination.getValue();

        int notesRemaining = ATM.getDenominationNotesMap().get(denomination);

        int notesDispensed = Math.min(notesRequired, notesRemaining);
        System.out.println("Dispensed "+notesDispensed+" no of Rs "+denomination.getValue()+" notes");

        ATM.getDenominationNotesMap().put(denomination, notesRemaining - notesDispensed);
        return amount - (notesDispensed * denomination.getValue());
    }
}
