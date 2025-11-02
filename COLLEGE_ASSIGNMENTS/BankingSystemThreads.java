package COLLEGE_ASSIGNMENTS;
/*
13. Develop a program that creates multiple threads to simulate a banking system where
multiple users deposit and withdraw from the same account (show synchronization).
 */
class Bank{
    int balance;
    Bank(int balance) {
        this.balance = balance;
    }
    public synchronized void deposit(int amount, String user){
        balance+=amount;
        System.out.println(user+" is depositing "+ amount);
        System.out.println("Current Balance is "+ balance);
        System.out.println("-----------------------------------------");
    }
    public synchronized void withdraw(int amount, String user){
        if(amount<balance){
            balance-=amount;
            System.out.println(user+" is withdrawing "+ amount);
            System.out.println("Current Balance is "+ balance);
            System.out.println("-----------------------------------------");
        }else{
            System.out.println("Insufficient Balance");
            System.out.println("-----------------------------------------");
        }
    }
}
class users extends Thread{
    Bank bank;
    String user;
    users(Bank bank,String user){
        this.bank=bank;
        this.user=user;
    }
    public void run(){
        bank.deposit(2000,user);

        bank.withdraw(500,user);
    }
}
public class BankingSystemThreads {
    public static void main() {
Bank bank = new Bank(10000);
users anant = new  users(bank,"anant");
users rishita = new   users(bank,"rishita");
users ram =  new users(bank,"ram");
 anant.start();
 rishita.start();
 ram.start();
    }
}
