package integration.datalayer.employee;

import datalayer.employee.EmployeeStorage;
import datalayer.employee.EmployeeStorageImpl;
import integration.ContainerizedDbIntegrationTestIT;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import servicelayer.employee.EmployeeServiceException;
import servicelayer.employee.EmployeeServiceImpl;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("integration")
public class CreateEmployeeTestIT extends ContainerizedDbIntegrationTestIT {
    private EmployeeStorage employeeStorage;

    @BeforeAll
    public void Setup() throws SQLException {

        runMigration(3);
        employeeStorage = new EmployeeStorageImpl(getConnectionString(), "root", getDbPassword());
    }

    @Test
    public void mustSaveEmployeeInDatabaseWhenCallingCreateEmployee() throws SQLException, EmployeeServiceException {
        // Arrange
        var employeeService = new EmployeeServiceImpl(employeeStorage);
        // Act
        int employeeId=employeeService.employeeCreation("John","Madden");
        // Assert
        var employee = employeeStorage.getEmployeeWithId(employeeId);
        assertTrue(employee!=null);
    }

    @Test
    public void mustReturnLatestId() throws SQLException, EmployeeServiceException {
        // Arrange
        var employeeService = new EmployeeServiceImpl(employeeStorage);
        // Act
        var id1 = employeeService.employeeCreation("John","Madden");
        var id2 = employeeService.employeeCreation("Kenneth","Hansen");
        // Assert
        assertEquals(1, id2 - id1);
    }

}
