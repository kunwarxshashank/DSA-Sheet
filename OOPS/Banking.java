class Bank {
    private double balance = 0;

    void Deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.balance += amount;
        System.out.println("Deposit Successfull of Amount:  "+amount);
        System.out.println("Your Balance:  "+this.balance);
    }

    void Withdraw(double amount){
        if(amount>this.balance){
            throw new IllegalArgumentException("Insufficient Balance..");
        }
        this.balance -= amount;
        System.out.println("Withdraw Successfull of Amount:  "+amount);
        System.out.println("Your Balance:  "+this.balance);
    }


}


public class Banking{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.Deposit(500.00);
        b.Withdraw(100.00);
    }
}