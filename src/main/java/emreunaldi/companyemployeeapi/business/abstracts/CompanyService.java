package emreunaldi.companyemployeeapi.business.abstracts;

import emreunaldi.companyemployeeapi.business.request.AddCompanyRequest;
import emreunaldi.companyemployeeapi.business.request.UpdateCompanyRequest;
import emreunaldi.companyemployeeapi.business.response.GetCompanyResponse;
import emreunaldi.companyemployeeapi.entities.Company;
import emreunaldi.companyemployeeapi.utilities.results.DataResult;
import emreunaldi.companyemployeeapi.utilities.results.Result;

import java.util.List;

public interface CompanyService {
    DataResult<AddCompanyRequest> add(AddCompanyRequest addCompanyRequest);
    Result delete(Long id);
    DataResult<Company> update(UpdateCompanyRequest updateCompanyRequest);
    DataResult<List<GetCompanyResponse>> getAll();
}
