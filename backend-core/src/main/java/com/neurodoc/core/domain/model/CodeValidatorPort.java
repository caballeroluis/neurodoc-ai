package com.neurodoc.core.domain.model;

import java.util.Optional;

/**
 * Pure inbound port enforcing Hexagonal Architecture isolation rules.
 * Intercepts binary git deltas to validate code structural compliance.
 */
public interface CodeValidatorPort {
    
    /**
     * Evaluates incoming raw git diff headers against local context rules.
     * @param rawGitDiff The string payload streamed by the native Rust interceptor.
     * @return ComplianceReport containing validation semaphores and metrics.
     */
    Optional<String> validateCommitDelta(String rawGitDiff);
}
