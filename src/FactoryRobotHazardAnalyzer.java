public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {
        int armPrecision = 80;
        int workerDensity = 5;
        String machineryState = "ON";

        validateInputs(armPrecision, workerDensity, machineryState);

        int riskScore = calculateRiskScore(
                armPrecision,
                workerDensity,
                machineryState
        );

        System.out.println("Hazard Risk Score: " + riskScore);
    }

    static void validateInputs(int armPrecision, int workerDensity, String machineryState) {
        if (armPrecision < 0 || armPrecision > 100) {
            throw new IllegalArgumentException("Invalid arm precision");
        }

        if (workerDensity < 0) {
            throw new IllegalArgumentException("Invalid worker density");
        }

        if (!machineryState.equals("ON") && !machineryState.equals("OFF")) {
            throw new IllegalArgumentException("Invalid machinery state");
        }
    }

    static int calculateRiskScore(int armPrecision, int workerDensity, String machineryState) {
        int riskScore = (100 - armPrecision) + (workerDensity * 10);

        if (machineryState.equals("ON")) {
            riskScore += 20;
        }

        return riskScore;
    }
}
