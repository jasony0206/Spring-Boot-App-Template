package com.jasonyoon.mvnapp.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jason on 8/27/15.
 */

public class PersonTest {

    private Person person;

    @Before
    public void setup() {
        person = new Person();
    }

    @Test
    public void setNameSetsName() {
        // Given
        String expectedName = "Jason";

        // When
        person.setName(expectedName);

        // Then
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void setGenderSetsGender() {
        // Given
        String expectedGender = "male";

        // When
        person.setGender(expectedGender);

        // Then
        Assert.assertEquals(expectedGender, person.getGender());
    }

    @Test
    public void setAgeSetsAge() {
        // Given
        int expectedAge = 21;

        // When
        person.setAge(expectedAge);

        // Then
        Assert.assertEquals(expectedAge, person.getAge());
    }
}
