package ru.kotadmi.Laba1.Pr_23.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<City> cities = List.of(
                new City("Antwerp", "Belgium"),
                new City("Bruges", "Belgium"),
                new City("Warsaw", "Poland"),
                new City("Hamburg", "German"),
                new City("Stuttgart", "German"),
                new City("Munich", "German")
        );

        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        for (City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }
        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}