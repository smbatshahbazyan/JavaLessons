package HomeworkSinceApril.ElectronicShop;

public abstract class Device {
    private String brand;
    private String modelName;
    private String color;
    private int yearOfManufacture;
    private double costPrice;
    private double salePrice;

    protected Device(String brand, String modelName, String color, int yearOfManufacture, int costPrice) {
        setBrand(brand);
        setModelName(modelName);
        setColor(color);
        setYearOfManufacture(yearOfManufacture);
        setCostPrice(costPrice);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public double getSalePrice() {
        return costPrice * 0.2;
    }
}
