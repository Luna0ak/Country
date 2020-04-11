import java.util.ArrayList;

public class Street {
    final String streetName;
    final int streetLength;
    private ArrayList<Building> buildingArrayList = new ArrayList<>();
    public Street(String streetName, int streetLength) {
        this.streetName = streetName;
        this.streetLength = streetLength;
    }

    public void addNewBuilding(Building building){
        this.buildingArrayList.add(building);
    }
    public ArrayList<Building> getAllBuildings(){
            return buildingArrayList;
    }
}
