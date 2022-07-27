package ru.sadikov.dz.magafondz.Services;

import org.springframework.data.domain.Page;
import ru.sadikov.dz.magafondz.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeByName(String name);
    void deleteEmployeeByName(String name);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}