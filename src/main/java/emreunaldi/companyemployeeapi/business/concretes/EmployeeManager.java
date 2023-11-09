package emreunaldi.companyemployeeapi.business.concretes;

import emreunaldi.companyemployeeapi.business.abstracts.EmployeeService;
import emreunaldi.companyemployeeapi.business.request.AddEmployeeRequest;
import emreunaldi.companyemployeeapi.business.request.UpdateEmployeeRequest;
import emreunaldi.companyemployeeapi.business.response.GetEmployeeResponse;
import emreunaldi.companyemployeeapi.dataAccess.EmployeeRepository;
import emreunaldi.companyemployeeapi.entities.Employee;
import emreunaldi.companyemployeeapi.utilities.mappers.ModelMapperService;
import emreunaldi.companyemployeeapi.utilities.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {
    EmployeeRepository _employeeRepository;
    ModelMapperService _modelMapperService;

    @Autowired
    public EmployeeManager(EmployeeRepository _employeeRepository, ModelMapperService _modelMapperService) {
        this._employeeRepository = _employeeRepository;
        this._modelMapperService = _modelMapperService;
    }

    @Override
    public DataResult<AddEmployeeRequest> add(AddEmployeeRequest addEmployeeRequest) {
        try {
            Employee employee = this._modelMapperService.forRequest().map(addEmployeeRequest, Employee.class);
            this._employeeRepository.save(employee);
            addEmployeeRequest = this._modelMapperService.forResponse().map(employee, AddEmployeeRequest.class);

            return new SuccessDataResult<>(addEmployeeRequest, "Employee added successfully");
        } catch (Exception error) {
            return new ErrorDataResult<>(error.getMessage());
        }
    }

    @Override
    public Result delete(Long id) {
        try {
            this._employeeRepository.deleteById(id);

            return new SuccessResult("Employee deleted successfully");
        } catch (Exception error) {
            return new ErrorResult(error.getMessage());
        }
    }

    @Override
    public DataResult<Employee> update(UpdateEmployeeRequest updateEmployeeRequest) {
        try {
            Employee employee = this._modelMapperService.forRequest().map(updateEmployeeRequest, Employee.class);
            this._employeeRepository.save(employee);

            return new SuccessDataResult<>(employee, "Employee updated successfully");
        } catch (Exception error) {
            return new ErrorDataResult<>(error.getMessage());
        }
    }

    @Override
    public DataResult<List<GetEmployeeResponse>> getAll() {
        try {
            List<Employee> employeeList = this._employeeRepository.findAll();
            List<GetEmployeeResponse> getEmployeeResponseList = employeeList
                    .stream()
                    .map(employee -> this._modelMapperService
                            .forResponse()
                            .map(employee, GetEmployeeResponse.class))
                    .toList();

            return new SuccessDataResult<>(getEmployeeResponseList, "Employees listed successfully");
        } catch (Exception error) {
            return new ErrorDataResult<>(error.getMessage());
        }
    }
}
