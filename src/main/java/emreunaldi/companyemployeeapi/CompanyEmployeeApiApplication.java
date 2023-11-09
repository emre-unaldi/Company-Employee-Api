package emreunaldi.companyemployeeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class CompanyEmployeeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyEmployeeApiApplication.class, args);
    }

}
