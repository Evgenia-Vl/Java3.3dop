package CreditPaymentService;

public class CreditPaymentService {
    public int calculate(double a, double b, double c) {

        double amount = a;

        double period = b;

        double interestRate = c;

        double rateMonth = interestRate / 100 / 12;

        double calcOne = 1 + rateMonth;

        double numerator = Math.pow(calcOne, b);

        double denominator = numerator - 1;

        double calcSecond = numerator / denominator;

        double payment = amount * rateMonth * calcSecond;

        return (int) payment;
    }

}



