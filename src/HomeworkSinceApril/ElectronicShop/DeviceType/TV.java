package HomeworkSinceApril.ElectronicShop.DeviceType;

import HomeworkSinceApril.ElectronicShop.Device;

public class TV extends Device {
    private Boolean isSmart;
    private double screenSize;

    TV(String brand, String modelName, String color, int yearOfManufacture, int costPrice, boolean isSmart, double screenSize) {
        super(brand, modelName, color, yearOfManufacture, costPrice);
        setSmart(isSmart);
        setScreenSize(screenSize);
    }

    public Boolean getSmart() {
        return isSmart;
    }

    public void setSmart(Boolean smart) {
        isSmart = smart;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
