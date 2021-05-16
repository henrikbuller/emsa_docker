package se.yrgo.service;

import java.util.List;

import javax.ejb.Remote;

import se.yrgo.domain.Employee;

@Remote
public interface EmployeeManagementService {
    public void registerEmployee(Employee employee);
    public List<Employee>getAllEmployees ();
    public List<Employee>searchBysurname(String surname);
    public Employee getById(int id);
}
