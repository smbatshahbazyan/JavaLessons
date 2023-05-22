package HomeworkSinceApril.ElectronicShop.DeviceType;

import HomeworkSinceApril.ElectronicShop.Device;

public class Earphone extends Device {
    private boolean isWithMicrophone;
    private boolean isWithVolumeControl;

    Earphone(String brand, String modelName, String color, int yearOfManufacture, int costPrice, boolean isWithMicrophone, boolean isWithVolumeControl) {
        super(brand, modelName, color, yearOfManufacture, costPrice);
        setWithMicrophone(isWithMicrophone);
        setWithVolumeControl(isWithVolumeControl);
    }

    public boolean isWithMicrophone() {
        return isWithMicrophone;
    }

    public void setWithMicrophone(boolean withMicrophone) {
        isWithMicrophone = withMicrophone;
    }

    public boolean isWithVolumeControl() {
        return isWithVolumeControl;
    }

    public void setWithVolumeControl(boolean withVolumeControl) {
        isWithVolumeControl = withVolumeControl;
    }
}
