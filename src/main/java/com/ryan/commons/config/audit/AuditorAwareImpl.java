package com.ryan.commons.config.audit;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<AuditableUserEx> {

	private AuditableUserEx auditor;
	
	public void setAuditor(AuditableUserEx auditor) {
		this.auditor = auditor;
	}

	@Override
	public AuditableUserEx getCurrentAuditor() {
		return auditor;
	}
	
	
}
