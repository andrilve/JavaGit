public class BankAccount {

    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public BankAccount(){
        this.balance = 0;
    }

    //  Снять деньги со счёта
    public void BankAccountMinus(double amount){
        if(amount > this.balance){
            System.out.println("Ошибка! Сумма снятия больше баланса!");
        }
        else{
            this.balance = this.balance - amount;
        }
    }

    // Положить деньги на счёт
    public void BankAccountPlus(double amount){
        this.balance = this.balance + amount;
    }

    // Узнать баланс
    public void Balance(){
        System.out.println("Текущий баланс " + this.balance);
    }

    //public - потому что этот метод необходим за пределом этого класса
    public boolean send(BankAccount receiver, double amount){
        if(amount > this.balance){
            System.out.println("Ошибка! Сумма снятия больше баланса!");
            return false;
        }
        else{
            this.balance = this.balance - amount;
            receiver.BankAccountPlus(amount);
            return true;
        }
    }
}
