package TASK4;

public class Bank extends Thread {

    public static void main(String[] args) {

        BankAccount account_1 = new BankAccount(1,250, "Alexander");
        System.out.println(account_1);
        account_1.refill(1000);
        account_1.cashWithdrawal(100000);

        BankAccount account_2 = new BankAccount(2,250, "Alex");
        System.out.println(account_2);
        account_2.refill(1000);
        account_2.cashWithdrawal(100);

    }
}