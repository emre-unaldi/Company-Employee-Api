package emreunaldi.companyemployeeapi.webApi;

import emreunaldi.companyemployeeapi.business.abstracts.EmployeeService;
import emreunaldi.companyemployeeapi.business.request.AddEmployeeRequest;
import emreunaldi.companyemployeeapi.business.request.UpdateEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    EmployeeService _employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this._employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody AddEmployeeRequest addEmployeeRequest) {
        return ResponseEntity.ok(this._employeeService.add(addEmployeeRequest));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        return ResponseEntity.ok(this._employeeService.delete(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody UpdateEmployeeRequest updateEmployeeRequest) {
        return ResponseEntity.ok(this._employeeService.update(updateEmployeeRequest));
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.ok(this._employeeService.getAll());
    }
}
