class BankAccount {
    double balance;

    public BankAccount() {
        balance = 0.0d;
    }

    public double deposited(double amount) {
        if (amount < 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else {
            balance = balance + amount;
        }
        return balance;
    }

    public double withdrawal(double amount) {
        if (amount < 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else if (amount > balance) {
            System.out.println("\nNepietiekami līdzekļi");
        } else {
            balance = balance - amount;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}