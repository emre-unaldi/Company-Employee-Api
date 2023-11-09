package emreunaldi.companyemployeeapi.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCompanyResponse {
    private Long id;
    private String companyName;
    private int taxNumber;
    private String sector;
    List<GetEmployeeResponse> employees;
}
