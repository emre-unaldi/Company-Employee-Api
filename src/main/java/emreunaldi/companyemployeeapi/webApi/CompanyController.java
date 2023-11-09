package emreunaldi.companyemployeeapi.webApi;

import emreunaldi.companyemployeeapi.business.abstracts.CompanyService;
import emreunaldi.companyemployeeapi.business.request.AddCompanyRequest;
import emreunaldi.companyemployeeapi.business.request.UpdateCompanyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {
    CompanyService _companyService;

    @Autowired
    public CompanyController(CompanyService _companyService) {
        this._companyService = _companyService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody AddCompanyRequest addCompanyRequest) {
        return ResponseEntity.ok(this._companyService.add(addCompanyRequest));
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        return ResponseEntity.ok(this._companyService.delete(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody UpdateCompanyRequest updateCompanyRequest) {
        return ResponseEntity.ok(this._companyService.update(updateCompanyRequest));
    }

    @GetMapping("/getAll")
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.ok(this._companyService.getAll());
    }
}
