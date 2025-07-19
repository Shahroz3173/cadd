abstract class BankAccount {
    String accountNumber;
    String bankName;

    public BankAccount(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    // abstract method ko define kia h yaha pe
    abstract void showLoanDetails();


    void showBankDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
    }
}

class PersonalLoanAccount extends BankAccount {
    String loanType;
    double loanAmount;

    public PersonalLoanAccount(String accountNumber, String bankName, String loanType, double loanAmount) {
        super(accountNumber, bankName);
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    @Override
    void showLoanDetails() {
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: $" + loanAmount);
    }
}

public class jul17_bankAccount {
    public static void main(String[] args) {
        PersonalLoanAccount account = new PersonalLoanAccount("12345678", "State Bank", "Home Loan", 500000);

        account.showBankDetails();
        account.showLoanDetails();
    }
}
