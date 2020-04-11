import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner dig = new Scanner(System.in);

        Country australia = new Country("Australia");

        City canberra = new City("Canberra", 0.5, "East", false);
        City sydney = new City("Sydney", 7.0, "South-East", true);
        City melbourne = new City("Melbourne", 6.0, "South", true);
        City brisbane = new City("Brisbane", 2.0, "North-East", false);
        City darwin = new City("Darwin", 1.0, "North", true);
        australia.addCity(canberra);
        australia.addCity(sydney);
        australia.addCity(melbourne);
        australia.addCity(brisbane);
        australia.addCity(darwin);

        Street oakly = new Street("Oakly", 20);
        Street royal = new Street("Royal", 15);
        Street parkLine = new Street("Park Line", 25);
        Street parkStreet = new Street("Park Street", 10);
        Street parkDrive = new Street("Park Drive", 20);
        Street parkMotorWay = new Street("Park Motorway", 15);
        Street parkHighway = new Street("Park Highway", 10);
        Street parkRoad = new Street("Park road", 25);
        Street parkSide = new Street("Park Side", 15);
        Street oaklyLine = new Street("Oakly Line", 14);
        Street oaklyStreet = new Street("Oakly Street", 19);
        Street oaklyDrive = new Street("Oakly Drive", 15);
        Street oaklyHighway = new Street("Oakly Highway", 17);
        Street oaklyRoad = new Street("Oakly Road", 20);
        Street oaklySide = new Street("Oakly Side", 15);


        brisbane.addNewStreet(oakly);
        brisbane.addNewStreet(parkDrive);
        brisbane.addNewStreet(royal);

        canberra.addNewStreet(parkLine);
        canberra.addNewStreet(parkStreet);
        canberra.addNewStreet(parkMotorWay);

        sydney.addNewStreet(parkHighway);
        sydney.addNewStreet(parkRoad);
        sydney.addNewStreet(parkSide);

        melbourne.addNewStreet(oaklyLine);
        melbourne.addNewStreet(oaklyStreet);
        melbourne.addNewStreet(oaklyDrive);

        darwin.addNewStreet(oaklyHighway);
        darwin.addNewStreet(oaklyRoad);
        darwin.addNewStreet(oaklySide);

        //System.out.println("In "+ australia.getCountryName()+ " there are " + australia.getNumberOfCities() + " cities.");

        Builder bob = new Builder();
        bob.createNewBuilding(oakly, "School");
        // oakly.listBuildings();
        // System.out.println(australia.getNumberOfCities());
        for (int i = 0; i < australia.getNumberOfCities(); i++) {
            System.out.println((i + 1) + "-" + australia.getCitiesArray().get(i).cityName);
        }

        int idOfCity =dig.nextInt();

        for (int i = 0; i < australia.getCity(idOfCity).getNumberOfStreets(); i++) {
            System.out.println((i + 1) + "-" +  australia.getCity(idOfCity).getStreetsArray().get(i).streetName);
        }

    }
}
