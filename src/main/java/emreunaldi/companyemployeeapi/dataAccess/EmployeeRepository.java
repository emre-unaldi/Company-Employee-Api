package emreunaldi.companyemployeeapi.dataAccess;

import emreunaldi.companyemployeeapi.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
