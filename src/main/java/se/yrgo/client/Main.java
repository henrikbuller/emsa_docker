package se.yrgo.client;
import java.util.List;
import java.util.Properties;

import javax.naming.NamingException;


import se.yrgo.domain.Employee;
import se.yrgo.service.EmployeeManagementService;

import javax.naming.Context;
import javax.naming.InitialContext;

public class Main {

public static void main(String[] args) throws NamingException {

    Properties jndiProperties = new Properties();

    jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,"org.wildfly.naming.client.WildFlyInitialContextFactory");
    jndiProperties.put(Context.PROVIDER_URL,"http-remoting://localhost:8080");
    jndiProperties.put("jboss.naming.client.ejb.context",true);

    Context jndi = new InitialContext(jndiProperties);
    EmployeeManagementService service =
            (EmployeeManagementService)jndi.lookup("EmployeeManagementServerApplication-1.0-SNAPSHOT-war/EmployeeManagementImplementation!se.yrgo.service.EmployeeManagementService");

    Employee emp1 = new Employee("Andreas","Green","Designer",2700);
    Employee emp2 = new Employee("Rikard","Blue","Tester",1800);
    Employee emp3 = new Employee("Ronald","Black","Programmer",2900);
    Employee emp4 = new Employee("Eric","Black","Manager",2000);

    service.registerEmployee(emp1);
    service.registerEmployee(emp2);
    service.registerEmployee(emp3);
    service.registerEmployee(emp4);

    List<Employee> employees = service.getAllEmployees();
    for (Employee employee: employees) {
        System.out.println(employee);
    }

}

}
    
