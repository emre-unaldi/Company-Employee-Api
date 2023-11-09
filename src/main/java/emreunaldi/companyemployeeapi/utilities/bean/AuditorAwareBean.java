package emreunaldi.companyemployeeapi.utilities.bean;

import emreunaldi.companyemployeeapi.utilities.audit.AuditorAwareManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditorAwareBean {
    @Bean
    public AuditorAware<String> auditorAware(){
        return new AuditorAwareManager();
    }
}
