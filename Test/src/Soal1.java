public class Soal1 {
    public static void main(String[] args) {
        int maxUnitsA = 80;
        int maxUnitsB = 100;
        int maxLaborHours = 160;
        int maxMachineHours = 180;

        int profitPerUnitA = 40;
        int profitPerUnitB = 30;

        int iterations = 10;

        int maxProfit = 0;
        int optimalUnitsA = 0;
        int optimalUnitsB = 0;

        for (int i = 0; i < iterations; i++) {
            for (int unitsA = 0; unitsA <= maxUnitsA; unitsA++) {
                for (int unitsB = 0; unitsB <= maxUnitsB; unitsB++) {
                    int laborHoursUsed = unitsA * 2 + unitsB * 1;
                    int machineHoursUsed = unitsA * 1 + unitsB * 2;

                    if (laborHoursUsed <= maxLaborHours && machineHoursUsed <= maxMachineHours) {
                        int profit = unitsA * profitPerUnitA + unitsB * profitPerUnitB;
                        if (profit > maxProfit) {
                            maxProfit = profit;
                            optimalUnitsA = unitsA;
                            optimalUnitsB = unitsB;
                        }
                    }
                }
            }
        }

        System.out.println("Optimal production plan:");
        System.out.println("Units of Product A: " + optimalUnitsA);
        System.out.println("Units of Product B: " + optimalUnitsB);
        System.out.println("Maximum Profit: $" + maxProfit);
    }
}
