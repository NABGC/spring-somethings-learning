package com.nabgc.properties.lists;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringListPropertiesApplication.class)
public class ListsPropertiesUnitTest {

    @Value("${arrayOfStrings}")
    private String[] arrayOfStrings;

    @Value("${arrayOfStrings}")
    private List<String> unexpectedListOfStrings;

    @Value("#{'${arrayOfStrings}'.split(',')}")
    private List<String> listOfStrings;

    @Value("#{${listOfStrings}}")
    private List<String> listOfStringsV2;

    @Value("#{'${listOfStringsWithCustomDelimiter}'.split(';')}")
    private List<String> listOfStringsWithCustomDelimiter;

    @Value("#{'${listOfBooleans}'.split(',')}")
    private List<Boolean> listOfBooleans;

    @Value("#{'${listOfIntegers}'.split(',')}")
    private List<Integer> listOfIntegers;

    @Value("#{'${listOfCharacters}'.split(',')}")
    private List<Character> listOfCharacters;

    @Autowired
    private Environment environment;

    @Test
    public void whenContextIsInitialized_thenInjectedArrayContainsExpectedValues() {
        assertArrayEquals(new String[] {"nabgc", "dot", "com"}, arrayOfStrings);
    }

    @Test
    public void whenContextIsInitialized_thenInjectedListContainsUnexpectedValues() {
        assertEquals(Collections.singletonList("nabgc,dot,com"), unexpectedListOfStrings);
    }

    @Test
    public void whenContextIsInitialized_thenInjectedListContainsExpectedValues() {
        assertEquals(Arrays.asList("nabgc", "dot", "com"), listOfStrings);
    }

    @Test
    public void whenContextIsInitialized_thenInjectedListV2ContainsExpectedValues() {
        assertEquals(Arrays.asList("nabgc", "dot", "com"), listOfStringsV2);
    }

    @Test
    public void whenContextIsInitialized_thenInjectedListWithCustomDelimiterContainsExpectedValues() {
        assertEquals(Arrays.asList("nabgc", "dot", "com"), listOfStringsWithCustomDelimiter);
    }

    @Test
    public void whenContextIsInitialized_thenInjectedListOfBasicTypesContainsExpectedValues() {
        assertEquals(Arrays.asList(false, false, true), listOfBooleans);
        assertEquals(Arrays.asList(1, 2, 3, 4), listOfIntegers);
        assertEquals(Arrays.asList('a', 'b', 'c'), listOfCharacters);
    }

    @Test
    public void whenReadingFromSpringEnvironment_thenPropertiesHaveExpectedValues() {
        String[] arrayOfStrings = environment.getProperty("arrayOfStrings", String[].class);
        List<String> listOfStrings = (List<String>)environment.getProperty("arrayOfStrings", List.class);

        assertArrayEquals(new String[] {"nabgc", "dot", "com"}, arrayOfStrings);
        assertEquals(Arrays.asList("nabgc", "dot", "com"), listOfStrings);
    }
}
