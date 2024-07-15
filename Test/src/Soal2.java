public class Soal2 {
    public static void main(String[] args) {
        int maxUnitsPW = 150;
        int maxUnitsSW = 200;
        int maxCost = 20000;
        int costPerPW = 80;
        int costPerSW = 30;
        int iterations = 10;

        double maxRevenue = 0;
        int optimalUnitsPW = 0;
        int optimalUnitsSW = 0;

        for (int i = 0; i < iterations; i++) {
            for (int unitsPW = 0; unitsPW <= maxUnitsPW; unitsPW++) {
                for (int unitsSW = 0; unitsSW <= maxUnitsSW; unitsSW++) {
                    int totalCost = unitsPW * costPerPW + unitsSW * costPerSW;
                    if (totalCost <= maxCost) {
                        double revenuePW = calculateRevenuePW(unitsPW);
                        double revenueSW = calculateRevenueSW(unitsSW);
                        double totalRevenue = revenuePW + revenueSW;

                        if (totalRevenue > maxRevenue) {
                            maxRevenue = totalRevenue;
                            optimalUnitsPW = unitsPW;
                            optimalUnitsSW = unitsSW;
                        }
                    }
                }
            }
        }

        System.out.println("Optimal production plan:");
        System.out.println("Units of Premium Widgets: " + optimalUnitsPW);
        System.out.println("Units of Standard Widgets: " + optimalUnitsSW);
        System.out.println("Maximum Revenue: $" + maxRevenue);
    }

    private static double calculateRevenuePW(int unitsPW) {
        double revenue = 0;
        for (int i = 1; i <= unitsPW; i++) {
            if (i <= 50) {
                revenue += 100;
            } else {
                revenue += (100 - (i - 50) * 1);
            }
        }
        return revenue;
    }

    private static double calculateRevenueSW(int unitsSW) {
        double revenue = 0;
        for (int i = 1; i <= unitsSW; i++) {
            if (i <= 100) {
                revenue += 50;
            } else {
                revenue += (50 - (i - 100) * 0.5);
            }
        }
        return revenue;
    }

}
