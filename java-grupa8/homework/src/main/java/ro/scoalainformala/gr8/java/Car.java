package ro.scoalainformala.gr8.java;

public class Car {
    private String manufacturer;
    private String model;
    private int productionYear;
    private int electricMotorKw;
    private int horsePower;
    private int electricBatteryKw;
    private int energyConsumptionKwPerKm;
    private int rangePeChargeKm;
    private boolean fastCharging;
    private boolean itIsNew;

    /**
     * It is the constructor of the Car object;
     *
     * @param manufacturer             is the name og the producer of car;
     * @param model                    is the model name of car;
     * @param productionYear           is the year when thw car was produced;
     * @param electricMotorKw          is the electrical-motor power (Kw);
     * @param horsePower               it is number of horse power of electrical-motor;
     * @param electricBatteryKw        it is the power of electrical battery (Kw);
     * @param energyConsumptionKwPerKm it is the consumption of the car (kw) for one km;
     * @param rangePeChargeKm          it is how many Km can car run with one charge;
     * @param fastCharging             if the car have or not this facility of fast charging;
     * @param itIsNew                  if the car is new or not;
     */
    public Car(String manufacturer, String model, int productionYear, int electricMotorKw, int horsePower,
               int electricBatteryKw, int energyConsumptionKwPerKm, int rangePeChargeKm, boolean fastCharging,
               boolean itIsNew) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.productionYear = productionYear;
        this.electricMotorKw = electricMotorKw;
        this.horsePower = horsePower;
        this.electricBatteryKw = electricBatteryKw;
        this.energyConsumptionKwPerKm = energyConsumptionKwPerKm;
        this.rangePeChargeKm = rangePeChargeKm;
        this.fastCharging = fastCharging;
        this.itIsNew = itIsNew;
    }

    /**
     * This method copy each value of the carModel parameters in this car;
     *
     * @param carModel is the car which will be copied;
     */
    public void copy(Car carModel) {
        this.model = carModel.model;
        this.electricMotorKw = carModel.electricMotorKw;
        this.electricBatteryKw = carModel.electricBatteryKw;
        this.energyConsumptionKwPerKm = carModel.energyConsumptionKwPerKm;
        this.manufacturer = carModel.manufacturer;
        this.productionYear = carModel.productionYear;
        this.rangePeChargeKm = carModel.rangePeChargeKm;
        this.horsePower = carModel.horsePower;
    }

    /**
     * Get the model name of this car;
     *
     * @return the model name;
     */
    public String getCarName() {
        return model;
    }

    /**
     * Get the new status of this car;
     *
     * @return true if the car is new and false otherwise;
     */
    public boolean getNewStatus() {
        return itIsNew;
    }

    /**
     * Get the manufacturer name;
     *
     * @return the name of manufacturer;
     */
    public String getCarManufacturer() {
        return manufacturer;
    }
}
