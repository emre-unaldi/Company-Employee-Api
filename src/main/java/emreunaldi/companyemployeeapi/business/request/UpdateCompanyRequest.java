package emreunaldi.companyemployeeapi.business.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCompanyRequest {
    private Long id;
    private String companyName;
    private int taxNumber;
    private String sector;
}
