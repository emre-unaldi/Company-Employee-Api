package emreunaldi.companyemployeeapi.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeResponse {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String department;
    private String companyName;
}
