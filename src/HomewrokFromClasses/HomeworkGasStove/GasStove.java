package HomewrokFromClasses.HomeworkGasStove;

class GasStove {
    public String producer;
    private int quantityGas;
    private int quantityElectric;
    private boolean turnGas = false;
    private boolean turnElectric = false;
    private int electricEnergy = 0;
    private int gasEnergy = 0;
    private int energy = 0;
    public String corpusMaterial;

    public void setQuantityGas(int quantityGas) {
        if (quantityGas >= 3 && quantityGas <= 5) {
            this.quantityGas = quantityGas;
        } else {
            this.quantityGas = 0;
            System.out.println("Please input value for gas eye from 3 to 5 ");
        }
    }

    public int getQuantityGas() {
        return quantityGas;
    }

    public void setQuantityElectric(int quantityElectric) {
        if (quantityElectric >= 1 && quantityElectric <= 3) {
            this.quantityElectric = quantityElectric;
        } else {
            this.quantityElectric = 0;
            System.out.println("Please input value for electric eye from 1 to 3 ");
        }
    }

    public int getQuantityElectric() {
        return quantityElectric;
    }

    public void setTurnGas(boolean turnGas) {
        this.turnGas = turnGas;
    }

    public boolean getTurnGas() {
        return turnGas;
    }

    public void setTurnElectric(boolean turnElectric) {
        this.turnElectric = turnElectric;
    }

    public boolean getTurnEle() {
        return turnElectric;
    }

    public void setEnergy(int quantityElectric, int quantityGas) {
        if (turnElectric) {
            electricEnergy = quantityElectric * 100;
        }
        if (turnGas) {
            gasEnergy = quantityGas * 80;
        }
        energy = electricEnergy + gasEnergy;
    }

    public int getEnergy() {
        return energy;
    }
}