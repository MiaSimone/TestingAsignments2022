package datalayer.customer;

import dto.Employee;
import dto.EmployeeCreation;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeStorage {
    public Employee getEmployeeWithId(int employeeId) throws SQLException;
    public int createEmployee(EmployeeCreation employeeToCreate) throws SQLException;
}
