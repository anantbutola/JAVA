package practice;
interface Accounts{
    void deposit(double amt);
    void withdraw(float amt);
    void calculateInterest();
}
class SavingAccount implements Accounts{
    String user;
    SavingAccount(String user){
        this.user = user;
    }
    double balance;
    public void deposit(double amt) {
        balance += amt;
        System.out.println(this.user + " deposited " + amt);
    }
    public void withdraw(float amt) {
        balance -= amt;
        System.out.println(this.user + " withdraw " + amt);
    }
    public void calculateInterest() {
        balance += (balance * 0.5)/100;
    }
    void getBalance(){
        System.out.println(this.user + "  "+balance);
    }
}
class CurrentAccount implements Accounts{
    String user;
    CurrentAccount(String user){
        this.user = user;
        System.out.println(this.user + "  "+this.balance);
    }
    double balance;
    public void deposit(double amt) {
        balance += amt;
        System.out.println(this.user + " deposited " + amt);
    }
    public void withdraw(float amt) {
        balance -= amt;
        System.out.println(this.user + " withdraw " + amt);
    }
    public void calculateInterest() {
        balance += (balance * 0.1)/100;
        System.out.println(this.user + "  "+this.balance);
    }
    void getBalance(){
        System.out.println(this.user + "  "+balance);
    }
}
public class interfac1 {
    public static void main(String[] args) {
        SavingAccount user1 = new SavingAccount("Anant");
        user1.deposit(10000);
        user1.withdraw(2000);
        user1.calculateInterest();
        user1.getBalance();

        CurrentAccount user2 = new CurrentAccount("Ram");
        user2.deposit(20000);
        user2.withdraw(5000);

        user2.calculateInterest();
        user2.getBalance();
    }
}
