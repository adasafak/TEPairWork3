package com.techelevator.crm;

import com.sun.org.apache.xerces.internal.util.PropertyState;
import com.techelevator.Pet;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class PetTests {

    Pet pet;

    @Before
    public void setup(){
        pet = new Pet();}

    @Test
    public void testListVaccinations() {

        List<String> actual = Arrays.asList("Rabies", "Distemper", "Parvo");
        List<String> expected = Arrays.asList("Rabies", "Distemper", "Parvo");

        expected.add("Rabies ");
        expected.add("Distemper ");
        expected.add("Parvo ");
        assertThat(actual, is(expected));




    }

    private void assertThat(List<String> actual, PropertyState propertyState) {
    }


}
