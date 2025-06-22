package Module2;

public class FinancialForecast {

    public static double forecast(int years, double value, double rate) {
        if (years == 0) return value;
        return forecast(years - 1, value * (1 + rate), rate);
    }

    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.1; // 10%
        int futureYears = 5;

        double futureValue = forecast(futureYears, currentValue, growthRate);
        System.out.println("Future value after " + futureYears + " years: ₹" + futureValue);
    }
}
