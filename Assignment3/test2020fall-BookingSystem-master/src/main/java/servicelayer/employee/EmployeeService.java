package servicelayer.employee;

import dto.Employee;

import java.sql.SQLException;

public interface EmployeeService {
    int employeeCreation(String firstName, String lastName) throws EmployeeServiceException;
    Employee getEmployeeById(int id) throws EmployeeServiceException, SQLException;

}
