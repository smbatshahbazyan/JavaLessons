package HomeworkSinceApril.ElectronicShop.DeviceType;

public class WirelessEarphone extends Earphone {
    private boolean isWithSensorControl;
    private boolean isChargingCase;

    WirelessEarphone(String brand, String modelName, String color, int yearOfManufacture, int costPrice, boolean isWithMicrophone, boolean isWithVolumeControl, boolean isWithSensorControl, boolean isChargingCase) {
        super(brand, modelName, color, yearOfManufacture, costPrice, isWithMicrophone, isWithVolumeControl);
        setWithSensorControl(isWithSensorControl);
        setChargingCase(isChargingCase);
    }

    public boolean isWithSensorControl() {
        return isWithSensorControl;
    }

    public void setWithSensorControl(boolean withSensorControl) {
        isWithSensorControl = withSensorControl;
    }

    public boolean isChargingCase() {
        return isChargingCase;
    }

    public void setChargingCase(boolean chargingCase) {
        isChargingCase = chargingCase;
    }
}
