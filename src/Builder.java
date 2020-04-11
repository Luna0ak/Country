public class Builder {
public void createNewBuilding(Street h, String type){
    Building building = new Building(type);
    h.addNewBuilding(building);
}
}
