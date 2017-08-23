package ro.scoalainformala.gr8.java;

public class Car {
    private String model;
    private int electricMotorKw;
    private int electricBatteryKw;
    private int energyConsumptionKwPerKm;
    private Manufacturer manufacturer;
    private int productionYear;
    private int rangePeChargeKm;
    private int horsePower;


    public String getCarName() {

        return model;
    }

    public boolean getNewStatus() {

        return false;
    }

    public void copy(Car carModel) {
        this.model = carModel.model;
        this.electricMotorKw = carModel.electricMotorKw;
        this.electricBatteryKw = carModel.electricBatteryKw;
        this.energyConsumptionKwPerKm = carModel.energyConsumptionKwPerKm;
        this.manufacturer.copy(carModel.manufacturer);
        this.productionYear = carModel.productionYear;
        this.rangePeChargeKm = carModel.rangePeChargeKm;
        this.horsePower = carModel.horsePower;
    }
}
