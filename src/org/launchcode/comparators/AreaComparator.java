package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by Timothy on 9/11/2017.
 */
public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {

        if (o1.getArea() > o2.getArea()) {return 1;}

        if (o1.getArea() < o2.getArea()) {return -1;}

        return 0;
    }
}
