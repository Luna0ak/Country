import java.util.ArrayList;

public class Country {

    final String countryName;
    private ArrayList<City> citiesArray=new ArrayList<>();




    public ArrayList<City> getCitiesArray() {
        return citiesArray;
    }
    public Country (String countryName) {
        this.countryName=countryName;
    }
    public void addCity(City city){
        this.citiesArray.add(city);
    }
    public int getNumberOfCities(){
        return citiesArray.size();
    }
    public City getCity(int id){
        return citiesArray.get(id-1);
    }
}
