package decagon.tolulope.OOP;

public class Account {
    public static void main(String[] args){
        BankAccount bobsAccount = new BankAccount("12231323", 120.0, "Ojo Henry", "myemail@mail.com", "093820382");
        System.out.println(bobsAccount.getAccountNumber());
        bobsAccount.withdrawFunds(100);

        bobsAccount.depositFunds(50);

        bobsAccount.withdrawFunds(100);

        bobsAccount.depositFunds(51);

        bobsAccount.withdrawFunds(100);
    }
}
