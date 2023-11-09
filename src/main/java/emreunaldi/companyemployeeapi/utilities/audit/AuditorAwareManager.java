package emreunaldi.companyemployeeapi.utilities.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareManager implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Emre Unaldi");
    }
}
