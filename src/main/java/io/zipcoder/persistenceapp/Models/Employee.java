package io.zipcoder.persistenceapp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Employeenumber;
    private String Firstname;
    private String Lastname;
    private String Title;
    private String Phonenumber;
    private String Email;
    private String Hiredate;
    private Manager manager;

    private Department number(Integer key) {
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(Employeenumber, employee.Employeenumber) && Objects.equals(Firstname, employee.Firstname) && Objects.equals(Lastname, employee.Lastname) && Objects.equals(Title, employee.Title) && Objects.equals(Phonenumber, employee.Phonenumber) && Objects.equals(Email, employee.Email) && Objects.equals(Hiredate, employee.Hiredate) && Objects.equals(manager, employee.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Employeenumber, Firstname, Lastname, Title, Phonenumber, Email, Hiredate, manager);
    }
}
