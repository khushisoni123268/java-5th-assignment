public class BankAccount {
    private double balance; 

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
    
        BankAccount myAccount = new BankAccount(1000);

        myAccount.checkBalance(); 
        myAccount.deposit(500);  
        myAccount.checkBalance();
        myAccount.withdraw(200); 
        myAccount.checkBalance(); 
        myAccount.withdraw(2000); 
    }
}