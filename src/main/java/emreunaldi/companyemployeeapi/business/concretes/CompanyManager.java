package emreunaldi.companyemployeeapi.business.concretes;

import emreunaldi.companyemployeeapi.business.abstracts.CompanyService;
import emreunaldi.companyemployeeapi.business.request.AddCompanyRequest;
import emreunaldi.companyemployeeapi.business.request.UpdateCompanyRequest;
import emreunaldi.companyemployeeapi.business.response.GetCompanyResponse;
import emreunaldi.companyemployeeapi.dataAccess.CompanyRepository;
import emreunaldi.companyemployeeapi.entities.Company;
import emreunaldi.companyemployeeapi.utilities.mappers.ModelMapperService;
import emreunaldi.companyemployeeapi.utilities.results.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {
    CompanyRepository _companyRepository;
    ModelMapperService _modelMapperService;

    @Autowired
    public CompanyManager(CompanyRepository _companyRepository, ModelMapperService _modelMapperService) {
        this._companyRepository = _companyRepository;
        this._modelMapperService = _modelMapperService;
    }

    @Override
    public DataResult<AddCompanyRequest> add(AddCompanyRequest addCompanyRequest) {
        try {
            Company company = this._modelMapperService.forRequest().map(addCompanyRequest, Company.class);
            this._companyRepository.save(company);
            addCompanyRequest = this._modelMapperService.forResponse().map(company, AddCompanyRequest.class);

            return new SuccessDataResult<>(addCompanyRequest, "Company added successfully");
        } catch (Exception error) {
            return  new ErrorDataResult<>(error.getMessage());
        }
    }

    @Override
    public Result delete(Long id) {
        try {
            this._companyRepository.deleteById(id);

            return new SuccessResult("Company deleted successfully");
        } catch (Exception error) {
            return new ErrorResult(error.getMessage());
        }
    }

    @Override
    public DataResult<Company> update(UpdateCompanyRequest updateCompanyRequest) {
        try {
            Company company = this._modelMapperService.forRequest().map(updateCompanyRequest, Company.class);
            this._companyRepository.save(company);

            return new SuccessDataResult<>(company, "Company updated successfully");
        } catch (Exception error) {
            return new ErrorDataResult<>(error.getMessage());
        }
    }

    @Override
    public DataResult<List<GetCompanyResponse>> getAll() {
        try {
            List<Company> companyList = this._companyRepository.findAll();
            List<GetCompanyResponse> getCompanyResponseList = companyList
                    .stream()
                    .map(company -> this._modelMapperService
                            .forResponse()
                            .map(company, GetCompanyResponse.class))
                    .toList();

            return new SuccessDataResult<>(getCompanyResponseList, "Companies listed successfully");
        } catch (Exception error) {
            return new ErrorDataResult<>(error.getMessage());
        }
    }
}
