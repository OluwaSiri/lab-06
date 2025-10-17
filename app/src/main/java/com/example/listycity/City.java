package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * This constructs a City object.
     *
     * @param city     The name of the city.
     * @param province The name of the province the city belongs to.
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This gets the city's name.
     *
     * @return The city name.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This gets the province name.
     *
     * @return The province name.
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares two City objects alphabetically by their city name.
     *
     * @param o The other city to compare with.
     * @return A negative integer, zero, or a positive integer if this city's name
     *         is lexicographically less than, equal to, or greater than the other city's name.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This checks if two City objects are equal based on their city and province names.
     *
     * @param o The object to compare with.
     * @return {@code true} if both city and province names match, otherwise {@code false}.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return city.equals(city1.city) &&
                province.equals(city1.province);
    }


    /**
     * This generates a hash code for the City object based on its city and province.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}


