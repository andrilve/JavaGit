import java.util.Calendar;

public class CardAccount extends BankAccount {
    //Комиссия состовляет 1%
    private double commission = 1;

    // Создаёт карточный счёт
    public CardAccount(double balance) {
        super(balance);
    }

    // Снять деньги с карточного счёта
    public void CardAccountWithdrawAmount(double amount) {
        double amountCommission = amount * (1 + this.commission/100);
        super.BankAccountMinus(amountCommission);
    }
}
