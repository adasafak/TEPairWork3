package com.techelevator.crm;

import com.sun.org.apache.xerces.internal.util.PropertyState;
import com.techelevator.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class PetTests {


    @Test

    public void testListVaccinations() {
        Pet pet = new Pet("Marshall","Cat");

        List<String> expected = new ArrayList<>();

        expected.add("Rabies ");
        expected.add("Distemper ");
        expected.add("Parvo ");
        pet.setVaccinations(expected);
        String expectedVaccinations ="Rabies, Distemper, Parvo";
        Assert.assertEquals(expected, pet.listVaccinations());



    }



}
