package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     * @throws IllegalArgumentException if the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks whether a given city is in the list.
     *
     * @param city The city to check.
     * @return {@code true} if the city exists in the list, {@code false} otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This removes a given city from the list.
     *
     * @param city The city to remove.
     * @throws IllegalArgumentException if the city is not in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list");
        }
        cities.remove(city);
    }

    /**
     * This returns how many cities are in the list.
     *
     * @return The total number of cities.
     */
    public int countCities() {
        return cities.size();
    }
}

