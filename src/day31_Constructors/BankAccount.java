package day31_Constructors;
/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance

        Actions:
            1. setInfo(): sets the accountHolder and accountNumber attributes
            2. toString()
                3. checkBalance():displays the available balance
                2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount
 */
public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo (String accountHolder, long accountNumber) { // we didn't include the deposite because it will change
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checkBalance (){
        System.out.println("your avaialbe balance is: $"+ balance);
    }


    public void deposit (double amount){
      if (amount <=0){
          System.out.println("Depositing amount cannot be zero or negative");
          return; // to exit the method right the way when the amount is invalid
      }
        balance+=amount;

    }

    public void withdraw (double amount){
        if (amount >balance){
            System.out.println("Insufficient balance");
            return;  // if the withdrawn ammount is greater than the available balance
        }
        if (amount <=0){
            System.out.println("Withdrawn amount cannot be negative or zero");
            return;
        }

        balance= balance - amount;
    }


}
