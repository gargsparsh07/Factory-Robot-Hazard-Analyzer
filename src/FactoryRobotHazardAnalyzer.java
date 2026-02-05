public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {
        try {
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

        } catch (HazardEvaluationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void validateInputs(int armPrecision, int workerDensity, String machineryState)
            throws HazardEvaluationException {

        if (armPrecision < 0 || armPrecision > 100) {
            throw new HazardEvaluationException("Invalid arm precision");
        }

        if (workerDensity < 0) {
            throw new HazardEvaluationException("Invalid worker density");
        }

        if (!machineryState.equals("ON") && !machineryState.equals("OFF")) {
            throw new HazardEvaluationException("Invalid machinery state");
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

/* Custom Exception Class */
class HazardEvaluationException extends Exception {

    public HazardEvaluationException(String message) {
        super(message);
    }
}
