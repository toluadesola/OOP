package decagon.tolulope.OOP;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){
        this.accountBalance += funds;
        System.out.println("Deposit of " + funds + ". New balance is " + this.accountBalance + ".");
    }

    public void withdrawFunds(double funds){
        if(funds > this.accountBalance){
            System.out.println("Insufficient funds, only " + this.accountBalance + " is available");
        }else {
            this.accountBalance -= funds;
            System.out.println("withdrawal of " + funds + " made. New balance is " + this.accountBalance + ".");
        }
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
