package se.yrgo.rest;

import se.yrgo.domain.Employee;
import se.yrgo.service.EmployeeManagementServiceLocal;

import javax.ejb.Stateless;
import javax.inject.Inject;

import javax.ws.rs.*;
import java.util.List;

@Stateless
@Path("/employees")
public class EmployeeResource {
    @Inject
    private EmployeeManagementServiceLocal service;

    @GET
    @Produces("application/JSON")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GET
    @Produces("application/JSON")
    @Path("{employeeNo}")
    public Employee findEmployeeById(@PathParam("employeeNo") int id) {
        return service.getById(id);
    }

    @POST
    @Produces("application/JSON")
    @Consumes("application/JSON")
    public Employee createEmployee(Employee employee) {
        service.registerEmployee(employee);
        return employee;
    }

}
