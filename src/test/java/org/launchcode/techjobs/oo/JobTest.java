package org.launchcode.techjobs.oo;

import org.junit.Test;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job();
        Job job2 = new Job();
        assert job1.equals(job1);
        assert !job1.equals(job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
      //  Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency)
        String name = "Amanda is cool";
        Employer employer = new Employer();
        Location location = new Location();
        PositionType positionType = new PositionType();
        CoreCompetency coreCompetency = new CoreCompetency();

        Job job = new Job(name, employer, location, positionType, coreCompetency);

        assert job.getName().equals(name);
        assert job.getEmployer().equals(employer);
        assert job.getLocation().equals(location);
        assert job.getPositionType().equals(positionType);
        assert job.getCoreCompetency().equals(coreCompetency);

    }

    @Test
    public void testSettingJobId() {

        Job job = new Job();
        job.setId(3);

        assert job.getId() == 3;

    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

    }

    @Test
    public void testToStringHandlesEmptyField() {


    }

}
