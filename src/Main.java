import CreditPaymentService.CreditPaymentService;

public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        // double interesRate = 9.99;    // процентная ставка
        // int period = 12;     // период кредитования в месяцах
        // int amount = 1_000_000;     // сумма кредита

        // int result = service.calculate(amount, period, interesRate);

        System.out.println();
        System.out.println(service.calculate(1_000_000, 12, 9.99));

        System.out.println();
        System.out.println(service.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println(service.calculate(1_000_000, 36, 9.99));

        // System.out.println(result);
    }
}