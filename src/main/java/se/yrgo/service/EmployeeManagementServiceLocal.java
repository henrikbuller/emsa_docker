package se.yrgo.service;

import se.yrgo.domain.Employee;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

@Local
public interface EmployeeManagementServiceLocal {
    public void registerEmployee(Employee employee);
    public List<Employee>getAllEmployees ();
    public List<Employee>searchBysurname(String surname);
    public Employee getById(int id);
}
