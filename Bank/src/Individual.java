public class Individual extends Client {

    private String fio;
    //создаём счёт с не нулевым балансом
    public Individual(double balance, String fio) {
        acc = new BankAccount(balance);
        this.fio = fio;
    }

    //создаём счёт с нулевым балансом
    public Individual(String fio) {
        acc = new BankAccount();
        this.fio = fio;
    }

    public void BankAccountMinus(double amount, BankAccount acc){
        acc.BankAccountMinus(amount);
    }

}
