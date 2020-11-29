import java.util.Calendar;

public class DepositAccount extends BankAccount {
    private final Calendar endDate;

    // Создадим депозитный расчётный счёт
    // С которого нельзя снимать деньги в течение месяца после последнего внесения
    public DepositAccount(double balance, Calendar startDate) {
        super(balance);
        this.endDate = startDate;
        this.endDate.add(Calendar.MONTH, 1);
    }

    // Снять деньги с депозитного счёта
    public void DepositMinus(double amount, Calendar minusDate) {
        if (minusDate.after(this.endDate)) {
            super.BankAccountMinus(amount);
        } else {
            System.out.println("Депозитный счёт, невозможно снять деньги раньше времени");
        }
    }

}
