public class LegalEntity extends Client {

    private String fio;

    //создаём счёт с не нулевым балансом
    public LegalEntity(double balance, String fio) {
        acc = new BankAccount(balance);
        this.fio = fio;
    }

    //создаём счёт с нулевым балансом
    public LegalEntity(String fio) {
        acc = new BankAccount();
        this.fio = fio;
    }

}
