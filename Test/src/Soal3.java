public class Soal3 {
    public static void main(String[] args) {
        int minDevelopersA = 5;
        int maxDevelopersA = 15;
        int minDevelopersB = 10;
        int maxDevelopersB = 20;
        int maxBudget = 100000;
        int costPerDeveloperA = 5000;
        int costPerDeveloperB = 4000;

        double maxRevenue = 0;
        int optimalDevelopersA = 0;
        int optimalDevelopersB = 0;

        for (int developersA = minDevelopersA; developersA <= maxDevelopersA; developersA++) {
            for (int developersB = minDevelopersB; developersB <= maxDevelopersB; developersB++) {
                int totalCost = developersA * costPerDeveloperA + developersB * costPerDeveloperB;
                if (totalCost <= maxBudget) {
                    double revenueA = calculateRevenueA(developersA);
                    double revenueB = calculateRevenueB(developersB);
                    double totalRevenue = revenueA + revenueB;

                    if (totalRevenue > maxRevenue) {
                        maxRevenue = totalRevenue;
                        optimalDevelopersA = developersA;
                        optimalDevelopersB = developersB;
                    }
                }
            }
        }

        System.out.println("Optimal allocation of developers:");
        System.out.println("Developers in Team A: " + optimalDevelopersA);
        System.out.println("Developers in Team B: " + optimalDevelopersB);
        System.out.println("Maximum Revenue: $" + maxRevenue);
    }

    private static double calculateRevenueA(int developersA) {
        int featuresA = developersA * 10;  // Assume each developer can develop 10 features
        double revenue = 0;
        for (int i = 1; i <= featuresA; i++) {
            if (i <= 40) {
                revenue += 120;
            } else {
                revenue += (120 - (i - 40) * 2);
            }
        }
        return revenue;
    }

    private static double calculateRevenueB(int developersB) {
        int featuresB = developersB * 10;  // Assume each developer can develop 10 features
        double revenue = 0;
        for (int i = 1; i <= featuresB; i++) {
            if (i <= 80) {
                revenue += 60;
            } else {
                revenue += (60 - (i - 80) * 1);
            }
        }
        return revenue;
    }

}
