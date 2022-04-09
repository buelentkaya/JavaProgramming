package day31Constructer;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "day31Constructer.BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("Your available balance is:" + balance);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Depositing amount cannot be zero or negative");
            return;
        }
        balance += amount;

    }

    public  void withdraw(double amount){
        if (amount>balance) {
            System.out.println("Insufficient balance");
            return;}
        if(amount<=0){
            System.out.println("Withdrawing amount cannot be zero or negative");
        return;}
        balance-=amount;
    }
}
