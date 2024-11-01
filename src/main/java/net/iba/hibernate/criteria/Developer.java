package net.iba.hibernate.criteria;

import jakarta.persistence.*;

@Entity
@Table(name = "HIBERNATE_DEVELOPERS")
public class Developer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;
    @Column (name = "FIRST_NAME")
    private String firstName;
    @Column (name = "LAST_NAME")
    private String lastName;
    @Column (name = "SPECIALTY")
    private String specialty;
    @Column (name = "EXPERIENCE")
    private int experience;

    /**
     * Default Constructor
     */
    public Developer() {
    }

    /**
     * Plain constructor
     */
    public Developer(String firstName, String lastName, String specialty, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.experience = experience;
    }

    /**
     * Getters and Setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * toString method (optional)
     */
    @Override
    public String toString() {
        return "Developer:\n" +
                "id: " + id +
                "\nFirst Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Specialty: " + specialty + "\n" +
                "Experience: " + experience + "\n";
    }
}
