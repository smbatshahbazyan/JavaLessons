package HomewrokFromClasses.HomeworkBuilding;

class District {
    private Building[] buildings;
    private int gardenArea;

    public District(int gardenArea, Building... buildings) {
        setGardenArea(gardenArea);
        setBuildings(buildings);
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

    public int getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }

    public int allApartment(Building... buildings) {
        int counterAllApartment = 0;
        for (int i = 0; i < buildings.length; i++) {
            counterAllApartment += buildings[i].getApartmentQuantity(buildings[i]);
        }
        return counterAllApartment;
    }

    public int gardenAreaForEachApartment(int area, int allApartments) {
        return area / allApartments;
    }
}

