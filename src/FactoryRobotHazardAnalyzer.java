public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {
        int armPrecision = 80;
        int workerDensity = 5;
        String machineryState = "ON";

        validateInputs(armPrecision, workerDensity, machineryState);
        System.out.println("Inputs are valid.");
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
}
