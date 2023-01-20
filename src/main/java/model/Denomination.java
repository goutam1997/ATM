package model;

public enum Denomination {
    TWO_THOUSAND(2000),
    FIVE_HUNDRED(500),
    HUNDRED(100);

    private int value;

    Denomination(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
