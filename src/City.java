import java.util.ArrayList;

public class City {
    //Спроектировать маленькую страну,
    // в которой должны быть как минимум 5 городов,
    // 3 улицы и на каждой улицы по 5 различных строений (к примеру дома,
    // школы, садики, магазины). Также у города должны быть строители,
    // которые по команде будут строить нужный тип строения и это строение
    // должно потом появится на улице. Причем при проектировании классов
    // учесть все изученные принципы ООП, и когда вы их будете применять,
    // в комментариях к коду это указать ОБЯЗАТЕЛЬНО!!
     final double population;
     final String cityName;
     final String location;
     final boolean oceanAvailability;
    private ArrayList<Street> streetsArray = new ArrayList<>();

    public void addNewStreet(Street street) {
        streetsArray.add(street);
    }

    public ArrayList<Street> getStreetsArray() {
        return streetsArray;
    }
    public int getNumberOfStreets() {
        return streetsArray.size();
    }
    public City(String cityName, double population, String location, boolean oceanAvailability) {
        this.cityName = cityName;
        this.population = population;
        this.location = location;
        this.oceanAvailability = oceanAvailability;
    }

}
