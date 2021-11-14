package pl.javaskills.creditapp.core.model;

public class PurposeOfLoan {
    private final double amount;
    private final PurposeOfLoanType type;

    public PurposeOfLoan(PurposeOfLoanType type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
