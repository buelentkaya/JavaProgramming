package day35_OOP_Encapsulation;

public class BankAccount {
    private  String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
            if(amount <= 0){
                System.err.println("Depositing amount can not be negative or zero");
                System.exit(1);
            }

            System.out.println("Depositing $"+amount+" to the account "+ accountNumber);
            balance += amount;
        }



    public void withdraw(double amount){
            if(amount <= 0){
                System.err.println("Withdrawing amount can not be negative or zero");
                System.exit(1);
            }

            if(balance <= 0){
                System.err.println("Insufficient balance");
                System.exit(1);
            }

            System.out.println("Withdrawing $"+amount+" from the account "+accountNumber);
            balance -= amount;



        }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

        }


/*
create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance
        encapsulate all the fields
        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()
 */



