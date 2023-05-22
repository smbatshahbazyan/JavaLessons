package HomeworkSinceApril.ElectronicShop.DeviceType;

import HomeworkSinceApril.ElectronicShop.Device;

public class Notebook extends Device {
    String operationSystem;
    private int ramMemory;
    private int hardDiskSize;
    private double screenSize;

    public Notebook(String brand, String modelName, String color, int yearOfManufacture, int costPrice, String operationSystem, int ramMemory, int hardDiskSize, double screenSize) {
        super(brand, modelName, color, yearOfManufacture, costPrice);
        setOperationSystem(operationSystem);
        setRamMemory(ramMemory);
        setHardDiskSize(hardDiskSize);
        setScreenSize(screenSize);
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
