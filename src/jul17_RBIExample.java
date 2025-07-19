public class jul17_RBIExample {
    public static void main(String[] args) {
        RBI sbi = new SBI("Home Loan");
        sbi.interest();

        RBI baroda = new Baroda("Home Loan");
        baroda.interest();
    }

}

abstract class RBI {
    private String loanType;

    public RBI(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }


    public abstract void interest();
}

class SBI extends RBI {
    public SBI(String loanType) {
        super(loanType);
    }

    @Override
    public void interest() {
        System.out.println("Bank: SBI");
        System.out.println("Loan Type: " + getLoanType());
        System.out.println("Interest Rate: 5%");
        System.out.println();
    }
}

class Baroda extends RBI {
    public Baroda(String loanType) {
        super(loanType);
    }

    @Override
    public void interest() {
        System.out.println("Bank: Bank of Baroda");
        System.out.println("Loan Type: " + getLoanType());
        System.out.println("Interest Rate: 7%");
        System.out.println();
    }
}

