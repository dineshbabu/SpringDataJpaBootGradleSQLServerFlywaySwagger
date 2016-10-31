package com.dinesh.springdatajpa.audit;

import org.springframework.data.domain.AuditorAware;

public class SecurityAuditorAware implements AuditorAware<String> {

	@Override
	public String getCurrentAuditor() {
		return "LoggedInUser";
	}

}
