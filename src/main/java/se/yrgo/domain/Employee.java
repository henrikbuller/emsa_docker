package se.yrgo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

@Entity
public class Employee implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
   private String firstName;
   private String surname;
   private String jobRole;
   private int salary;


   
   public Employee () {}
   
   public Employee(String firstName, String surname, String jobRole, int salary) {
    this.firstName = firstName;
    this.surname = surname;
    this.jobRole = jobRole;
    this.salary = salary;
}

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
    return id;
}

public String getFirstName() {
    return firstName;
}

public String getSurname() {
    return surname;
}

public String getJobRole() {
    return jobRole;
}

public int getSalary() {
    return salary;
}

public String toString() {
       return "Employee: " + this.firstName + " " + this.surname;
   }

}
