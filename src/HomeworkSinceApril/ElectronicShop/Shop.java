package HomeworkSinceApril.ElectronicShop;

import HomeworkSinceApril.ElectronicShop.DeviceType.Notebook;

public abstract class Shop {
    Device[] devices;
    public static int incomeFromSale = 0;

    public static void cardPayment(int salePrice) {
        incomeFromSale += salePrice;
    }
}
