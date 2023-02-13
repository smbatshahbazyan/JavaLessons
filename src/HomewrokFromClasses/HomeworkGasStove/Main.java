package HomewrokFromClasses.HomeworkGasStove;

public class Main {
    public static void main(String[] args) {
        //Create new object
        GasStove gasStove1 = new GasStove();
        gasStove1.producer="Berg";
        gasStove1.setQuantityGas(3);
        gasStove1.setQuantityElectric(3);
        gasStove1.setTurnElectric(true);//Turn on electric eye
        gasStove1.setTurnGas(true);//Turn on Gas eye
        gasStove1.setEnergy(gasStove1.getQuantityGas(), gasStove1.getQuantityElectric());
        gasStove1.corpusMaterial="Glass";
        //Printing new object details
        System.out.println("Gas stove is produced by company  " + gasStove1.producer);
        System.out.println("Quantity of gas eye is " + gasStove1.getQuantityGas());
        System.out.println("Quantity of electric eye is " + gasStove1.getQuantityElectric());
        System.out.println("Energy for turned on eye is " + gasStove1.getEnergy());
        System.out.println("Gas stove is made from " + gasStove1.corpusMaterial);
    }

}
