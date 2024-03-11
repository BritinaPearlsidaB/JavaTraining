
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}


 class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount implements Transaction {
     SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public
     void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

class CurrentAccount extends BankAccount implements Transaction {
    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn $" + amount);
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123");
        CurrentAccount currentAccount = new CurrentAccount("CA456");

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        savingsAccount.showBalance();

        currentAccount.deposit(500);
        currentAccount.withdraw(300);
        currentAccount.showBalance();
    }
}

