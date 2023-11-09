package emreunaldi.companyemployeeapi.business.abstracts;

import emreunaldi.companyemployeeapi.business.request.AddEmployeeRequest;
import emreunaldi.companyemployeeapi.business.request.UpdateEmployeeRequest;
import emreunaldi.companyemployeeapi.business.response.GetEmployeeResponse;
import emreunaldi.companyemployeeapi.entities.Employee;
import emreunaldi.companyemployeeapi.utilities.results.DataResult;
import emreunaldi.companyemployeeapi.utilities.results.Result;

import java.util.List;

public interface EmployeeService {
    DataResult<AddEmployeeRequest> add(AddEmployeeRequest addEmployeeRequest);
    Result delete(Long id);
    DataResult<Employee> update(UpdateEmployeeRequest updateEmployeeRequest);
    DataResult<List<GetEmployeeResponse>> getAll();
}
