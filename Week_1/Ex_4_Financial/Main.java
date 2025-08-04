package Week_1.Ex_4_Financial;

public class Main {
    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double growthRate = 0.08; // 8% annual growth
        int years = 10;

        double valueRecursive = FinancialForecaster.forecastValue(initialInvestment, growthRate, years);
        System.out.printf("Recursive Forecast (Year %d): ₹%.2f\n", years, valueRecursive);

        double[] memo = new double[years + 1];
        double valueMemo = FinancialForecaster.forecastValueMemo(initialInvestment, growthRate, years, memo);
        System.out.printf("Memoized Forecast (Year %d): ₹%.2f\n", years, valueMemo);
    }
}
