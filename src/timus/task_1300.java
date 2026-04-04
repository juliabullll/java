package timus;
import java.util.*;
public class task_1300 {
    static List<Double> thresholds = new ArrayList<>();
    static List<Double> rates = new ArrayList<>();
    static double L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        L = Double.parseDouble(sc.nextLine());

        while (true) {
            double n = sc.nextDouble();
            double s = sc.nextDouble();
            thresholds.add(n);
            rates.add(s);
            if (n == 0) break;
        }

        List<Double> payouts = new ArrayList<>();
        while (true) {
            double val = sc.nextDouble();
            if (val == -1) break;
            payouts.add(val);
        }

        double totalR = 0;
        double totalTaxWithheld = 0;

        for (double payout : payouts) {
            double R = findR(payout);
            totalR += R;

            double incomeWithCoeff = R * (1 + L / 100);
            double tax = calculateTax(incomeWithCoeff);
            totalTaxWithheld += tax;
        }

        double totalIncomeWithCoeff = totalR * (1 + L / 100);
        double totalTax = calculateTax(totalIncomeWithCoeff);

        double result = totalTax - totalTaxWithheld;

        System.out.printf("%.2f", result);
    }

    static double calculateTax(double income) {
        if (income <= 0) return 0;
        double tax = 0;
        double prev = 0;
        for (int i = 0; i < thresholds.size(); i++) {
            double n = thresholds.get(i);
            double s = rates.get(i);
            if (income <= n || i == thresholds.size() - 1) {
                tax += (income - prev) * s / 100;
                break;
            } else {
                tax += (n - prev) * s / 100;
                prev = n;
            }
        }
        return tax;
    }

    static double calculatePayout(double R) {
        double incomeWithCoeff = R * (1 + L / 100);
        double tax = calculateTax(incomeWithCoeff);
        return incomeWithCoeff - tax;
    }

    static double findR(double targetPayout) {
        double left = 0;
        double right = 1e12;
        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2;
            double payout = calculatePayout(mid);
            if (payout < targetPayout) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return (left + right) / 2;
    }
}
