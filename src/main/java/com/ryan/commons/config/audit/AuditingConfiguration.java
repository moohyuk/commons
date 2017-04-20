package com.ryan.commons.config.audit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditingConfiguration {

	@Bean
	public AuditorAwareImpl auditorAware() {
		return new AuditorAwareImpl();
	}
}
