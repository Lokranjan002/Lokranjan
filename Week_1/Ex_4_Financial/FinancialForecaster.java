package Week_1.Ex_4_Financial;

public class FinancialForecaster {

    // Recursive version
    public static double forecastValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized with memoization
    public static double forecastValueMemo(double initialValue, double growthRate, int years, double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = forecastValueMemo(initialValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}
