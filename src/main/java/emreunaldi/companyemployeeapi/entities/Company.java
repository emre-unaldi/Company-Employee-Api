package emreunaldi.companyemployeeapi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "companies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company extends BaseEntity implements Serializable {
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "tax_number")
    private int taxNumber;

    @Column(name = "sector")
    private String sector;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Employee> employees;
}
