package org.launchcode.techjobs.oo;

import javax.xml.namespace.QName;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // 1. constructor to initialize unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    // 2. initialize other five fields - this needs to call to the first to initialize 'id' field
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); //calls first constructor to initialize ID
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //ternary conditional operators
    @Override
    public String toString() {
        return "\nID: " + this.id
                + "\nName: " +  (this.name == null || this.name.isEmpty() ? "Data not available" : this.name)
                + "\nEmployer: " + (this.employer == null || this.employer.toString().isEmpty() ? "Data not available" : this.employer.toString())
                + "\nLocation: " + (this.location == null || this.location.toString().isEmpty() ? "Data not available" : this.location.toString())
                + "\nPosition Type: " + (this.positionType == null || this.positionType.toString().isEmpty()? "Data not available" : this.positionType.toString())
                + "\nCore Competency: " + (this.coreCompetency == null || this.coreCompetency.toString().isEmpty() ? "Data not available" : this.coreCompetency.toString()) + "\n";
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.

    // 4. getters and setters for each field EXCEPT nextID and ID. Add setter for Id

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

