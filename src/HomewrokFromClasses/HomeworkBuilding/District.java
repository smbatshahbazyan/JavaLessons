package HomewrokFromClasses.HomeworkBuilding;

class District {
    private Building[] buildings;
    private int gardenArea;
    public District(int gardenArea,Building...buildings) {
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

    public int gardenAreaForApartment(int a, int b, int c, int d){
        return d/(a+b+c);
    }
}

