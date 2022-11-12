package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List vaccinations = new ArrayList();


    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public List getVaccinations() {
        return vaccinations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setVaccinations(List vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String listVaccinations(){
        String NewVaccinations = "Rabies, Distemper, Parvo";
        List<String> vaccinations  = Arrays.asList(NewVaccinations.split(","));

        return NewVaccinations;
    }


}
