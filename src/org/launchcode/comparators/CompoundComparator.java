package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Timothy on 9/11/2017.
 */
public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> comparator) {
        comparators.add(comparator);
    }



    @Override
    public int compare(City o1, City o2) {return o1.getName().compareTo(o2.getName());
    }
}
