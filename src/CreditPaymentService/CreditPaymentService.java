package CreditPaymentService;

public class CreditPaymentService {
    public int calculate(double amount, double period, double interestRate) {

        double rateMonth = interestRate / 100 / 12;

        double calcOne = 1 + rateMonth;

        double numerator = Math.pow(calcOne, period);

        double denominator = numerator - 1;

        double calcSecond = numerator / denominator;

        double payment = amount * rateMonth * calcSecond;

        return (int) payment;
    }

}



