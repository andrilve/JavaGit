import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        // Создаем расчетный счет в банке
        BankAccount accFirst = new BankAccount(1000);
        System.out.print("Узнаенм баланс созданного расчетного счета. ");
        accFirst.Balance();

        // Внесём сумму на счёт
        accFirst.BankAccountPlus(1000);
        System.out.print("Узнаенм баланс расчетного счета после внесения 1000. ");
        accFirst.Balance();

        // Снимем сумму со счёта
        accFirst.BankAccountMinus(500);
        System.out.print("Узнаенм баланс расчетного счета после снятия 500. ");
        accFirst.Balance();

        //
        System.out.println(" ");

        // Создадим депозитный счёт
        // С которого нельзя снимать деньги в течение месяца после последнего внесения
        Calendar start = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        DepositAccount dep = new DepositAccount(1005, start);
        System.out.print("Баланс депозитного счёта ");
        dep.Balance();

        Calendar dateFalse = new GregorianCalendar(2017, Calendar.FEBRUARY, 20);
        Calendar dateTrue = new GregorianCalendar(2017, Calendar.FEBRUARY, 26);

        //Пробуем снять сумму при дате < 1месяц
        dep.DepositMinus(500, dateFalse);
        //Пробуем снять сумму при дате > 1месяц
        dep.DepositMinus(500, dateTrue);
        System.out.print("Узнаенм баланс депозитного счета после снятия 500. ");
        dep.Balance();

        //
        System.out.println(" ");

        // Создадим карточный счёт
        // При снятии денег с которого будет взиматься комиссия 1%.
        CardAccount card = new CardAccount(1000);
        System.out.print("Баланс карточного счёта ");
        card.Balance();
        card.CardAccountWithdrawAmount(100);
        System.out.print("Баланс карточного счёта после снятия 100 ");
        card.Balance();

        //
        System.out.println(" ");

        System.out.print("Узнаенм баланс первого расчетного счета. ");
        accFirst.Balance();
        // Создаем второй расчетный счет
        BankAccount accSecond = new BankAccount(300);
        System.out.print("Узнаенм баланс второго расчетного счета. ");
        accSecond.Balance();

        // Переведем 200 с первого рс на второй рс
        double amountSend = 200;
        if (accFirst.send(accSecond, amountSend)) {
            System.out.println("Зачисление прошло успешно!");
        }
        // Узнаем баланс расчетных счетов
        System.out.print("Узнаенм баланс первого рс после снятия 200. ");
        accFirst.Balance();
        System.out.print("Узнаенм баланс второго рс после зачисления 200. ");
        accSecond.Balance();

        System.out.println(" ");

        //Заведём нового клиента - Физическаое лицо
        double balance = 1000;
        Individual Pupkin = new Individual(balance, "Pupkin");
        Pupkin.acc.BankAccountPlus(500);
        Pupkin.acc.BankAccountMinus(250);
        Pupkin.acc.Balance();

        //double balance = 1000;
        Individual Petrov = new Individual("Petrov");
        //BankAccount accPupkin= new BankAccount(300);
        Petrov.acc.Balance();
        Petrov.acc.BankAccountMinus(1000);
        Petrov.BankAccountMinus(1000, Petrov.acc);
    }
}
