public class Main {
    public static void main(String[] args) {

        int account = 35_899; // начальный счёт
        int deposit = 10_000; // сумма пополнения

        int bonus;
        if (deposit >= 1000) {
            int totalBonus = account + deposit;
            bonus = deposit / 100;

            System.out.println("Итоговый счет: " + totalBonus);
            System.out.println("Бонусные рубли: " + bonus);
        } else  {
            int totalBonus = account + deposit;
            bonus = 0;

            System.out.println("Итоговый счет: " + totalBonus);
            System.out.println("Бонусные рубли: " + bonus);
        }
    }
}
