package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator nameComparator = new NameComparator();
        cities.sort(nameComparator);
        System.out.println("Cities sorted by name:");
        printCities(cities);
        System.out.println();

        StateComparator stateComparator = new StateComparator();
        cities.sort(stateComparator);
        System.out.println("Cities sorted by state:");
        printCities(cities);
        System.out.println();

        PopulationComparator populationComparator = new PopulationComparator();
        cities.sort(populationComparator);
        System.out.println("Cities sorted by population:");
        printCities(cities);
        System.out.println();

        AreaComparator areaComparator = new AreaComparator();
        cities.sort(areaComparator);
        System.out.println("Cities sorted by area:");
        printCities(cities);
        System.out.println();

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
