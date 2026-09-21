import java.util.Scanner;

public class Plant {
    String plantName;
    double soilMoisture;
    double temperature;

    void getPlantDetails() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Plant Name: ");
        plantName = r.nextLine();
        System.out.print("Enter Soil Moisture: ");
        soilMoisture = r.nextDouble();
        System.out.print("Enter Temperature: ");
        temperature = r.nextDouble();
    }

    String getPlantCondition() {
        if (soilMoisture < 30) {
            return "Dry / Needs Water";
        } else if (temperature > 35) {
            return "Temperature Too High";
        } else if (soilMoisture > 70) {
            return "Overwatered";
        } else if (soilMoisture >= 30 && soilMoisture <= 70 && temperature <= 35) {
            return "Optimal / Healthy";
        } else {
            return "Normal";
        }
    }

    void displayPlantStatus() {
        System.out.println("Plant Name: " + plantName);
        System.out.println("Soil Moisture: " + soilMoisture);
        System.out.println("Temperature: " + temperature);
        System.out.println("Plant Condition: " + getPlantCondition());
    }

    public static void main(String[] args) {
        Plant p = new Plant();
        p.getPlantDetails();
        p.displayPlantStatus();
    }
}
