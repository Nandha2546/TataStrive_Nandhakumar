package day14;

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread depositThread1 = new DepositThread(account, 500);
        Thread depositThread2 = new DepositThread(account, 200);
        Thread withdrawThread1 = new WithdrawThread(account, 300);
        Thread withdrawThread2 = new WithdrawThread(account, 700);

        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}

