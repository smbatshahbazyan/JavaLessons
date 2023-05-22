package HomeworkSinceApril.ElectronicShop.DeviceType;

public class Phone extends Notebook {
    private Boolean isTouchScreen;

    Phone(String brand, String modelName, String color, int yearOfManufacture, int costPrice, int salePrice, String operationSystem, int ramMemory, int hardDiskSize, double screenSize, boolean isTouchScreen) {
        super(brand, modelName, color, yearOfManufacture, costPrice, operationSystem, ramMemory, hardDiskSize, screenSize);
        setTouchScreen(isTouchScreen);
    }

    public Boolean getTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(Boolean touchScreen) {
        isTouchScreen = touchScreen;
    }
}
