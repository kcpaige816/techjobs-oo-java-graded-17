package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job jobIdTest1 = new Job();
        Job jobIdTest2 = new Job();
        assertNotEquals(jobIdTest1, jobIdTest2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobAllFieldsTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Name test
        assertEquals(jobAllFieldsTest1.getName(), "Product tester");
        assertTrue(jobAllFieldsTest1.getName() instanceof String);
        // Employer test
        assertEquals(jobAllFieldsTest1.getEmployer().getValue(), "ACME");
        assertTrue(jobAllFieldsTest1.getEmployer() instanceof Employer);
        // Location test
        assertEquals(jobAllFieldsTest1.getLocation().getValue(), "Desert");
        assertTrue(jobAllFieldsTest1.getLocation() instanceof Location);
        // PositionType test
        assertEquals(jobAllFieldsTest1.getPositionType().getValue(), "Quality control");
        assertTrue(jobAllFieldsTest1.getPositionType() instanceof PositionType);
        // CoreCompetency test
        assertEquals(jobAllFieldsTest1.getCoreCompetency().getValue(), "Persistence");
        assertTrue(jobAllFieldsTest1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job jobEqualityTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobEqualityTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(jobEqualityTest1.getId(), jobEqualityTest2.getId());
        assertFalse(jobEqualityTest1.equals(jobEqualityTest2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobNewlineTest1 = new Job();
        String expected = System.lineSeparator() +
                "ID: " + jobNewlineTest1.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();
        assertEquals(expected, jobNewlineTest1.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobNewlineTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator() +
                "ID: " + jobNewlineTest1.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, jobNewlineTest1.toString());
    }

    // start back up here!
    @Test
    public void testToStringHandlesEmptyField() {
        Job jobNewlineTest1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator() +
                "ID: " + jobNewlineTest1.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, jobNewlineTest1.toString());
    }

}