package ro.scoalainformala.gr8.java;

/**
 * @author Sorin
 */
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
     * @param fastCharging             boolean, if the car have this is is true;
     * @param itIsNew                  boolean, if the car is new is true;
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
     * It is the null constructor of the Car object;
     */
    public Car() {
        this("", "", 0, 0, 0, 0, 0,
                0, false, false);
    }

    /**
     * This method is a constructor which copy carModel parameter;
     *
     * @param carModel it is the car which will be copied;
     */
    public Car(Car carModel) {
        this.model = carModel.model;
        this.electricMotorKw = carModel.electricMotorKw;
        this.electricBatteryKw = carModel.electricBatteryKw;
        this.energyConsumptionKwPerKm = carModel.energyConsumptionKwPerKm;
        this.manufacturer = carModel.manufacturer;
        this.productionYear = carModel.productionYear;
        this.rangePeChargeKm = carModel.rangePeChargeKm;
        this.horsePower = carModel.horsePower;
        this.itIsNew = carModel.itIsNew;
        this.fastCharging = carModel.fastCharging;
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

    /**
     * Set the car type / name;
     *
     * @param name is the car type / name;
     */
    public void setName(String name) {
        this.model = name;
    }

    /**
     * Check if the cars have the same names.
     *
     * @param carName it is the car name.
     * @return true if have the same name or false if not;
     */
    public boolean equalsName(String carName) {
        if (this.getCarName().equals(carName)) {
            return true;
        }
        return false;
    }

    /**
     * @return the rage per charge of the car
     */
    public int getRange() {
        return rangePeChargeKm;
    }

    /**
     * @return the horse power of the car
     */
    public int getHorsepower() {
        return horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Car))
            return false;

        Car car = (Car) o;

        if (productionYear != car.productionYear)
            return false;
        if (electricMotorKw != car.electricMotorKw)
            return false;
        if (horsePower != car.horsePower)
            return false;
        if (electricBatteryKw != car.electricBatteryKw)
            return false;
        if (energyConsumptionKwPerKm != car.energyConsumptionKwPerKm)
            return false;
        if (rangePeChargeKm != car.rangePeChargeKm)
            return false;
        if (fastCharging != car.fastCharging)
            return false;
        if (itIsNew != car.itIsNew)
            return false;
        if (manufacturer != null ? !manufacturer.equals(car.manufacturer) : car.manufacturer != null)
            return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }
}
