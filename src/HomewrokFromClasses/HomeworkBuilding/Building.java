package HomewrokFromClasses.HomeworkBuilding;

class Building {
    private int buildingFloorQuantity;
    private int[] apartmentWithTwoRoom;
    private int[] apartmentWithThreeRoom;
    private String buildingType;

    Building(int buildingFloorQuantity, int[] apartmentWithTwoRoom, int[] apartmentWithThreeRoom, String buildingTypetype) {
        setBuildingFloorQuantity(buildingFloorQuantity);
        setApartmentWithTwoRoom(apartmentWithTwoRoom);
        setApartmentWithThreeRoom(apartmentWithThreeRoom);
        setBuildingType(buildingType);
    }


    public int getBuildingFloorQuantity() {
        return buildingFloorQuantity;
    }

    public void setBuildingFloorQuantity(int buildingFloorQuantity) {
        this.buildingFloorQuantity = buildingFloorQuantity;
    }

    public int getApartmentWithTwoRoom() {
        return apartmentWithTwoRoom.length;
    }

    public void setApartmentWithTwoRoom(int... apartmentWithTwoRoom) {
        this.apartmentWithTwoRoom = apartmentWithTwoRoom;
    }

    public int getApartmentWithThreeRoom() {
        return apartmentWithThreeRoom.length;
    }

    public void setApartmentWithThreeRoom(int... apartmentWithThreeRoom) {
        this.apartmentWithThreeRoom = apartmentWithThreeRoom;
    }

    public String getBuildingType() {
        if (buildingType.equals("panel") || buildingType.equals("monolithic")) {
            return buildingType;
        } else {
            System.exit(0);
            return null;
        }
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }
}
