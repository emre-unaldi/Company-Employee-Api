package emreunaldi.companyemployeeapi.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String department;
    private int companyId;
}
