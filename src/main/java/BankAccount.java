/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /** Checking account type. */
        CHECKINGS,
        /** Saving account type. */
        SAVINGS,
        /** Student account type. */
        STUDENT,
        /** Workplace account type. */
        WORKPLACE
    }

    /** The account number. */
    private int accountNumber;
    /** The type of bank account. */
    private BankAccountType accountType;
    /** The balance of the account. */
    private double accountBalance;
    /** The name of the owner of the account. */
    private String ownerName;
    /** The interest rate of the account. */
    private double interestRate;
    /** The amount of interest earned. */
    private double interestEarned;

    /**
     * Create an instance of a BankAccount.
     *
     * @param name the name of the owner of the bank account
     * @param accountCategory the type of bank account created
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.addAccount();;
    }

    /**
     * Will return the account balance.
     *
     * @return the account balance
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * Will set the account balance.
     *
     * @param d the balance to set the account balance to
     */
    public void setAccountBalance(final double d) {
        this.accountBalance = d;
    }

    /**
     * Will set the owner name of the account.
     *
     * @param s the new owner name to set
     */
    public void setOwnerName(final String s) {
        this.ownerName = s;
    }
}
