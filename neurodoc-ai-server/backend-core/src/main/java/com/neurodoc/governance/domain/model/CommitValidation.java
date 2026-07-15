package com.neurodoc.governance.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Pure domain model tracking active code quality telemetry parameters.
 * Keeps business validation rules completely untainted by external frameworks or infrastructure layers.
 */
public class CommitValidation {
    private final UUID validationId;
    private final UUID traceId;
    private final String repositoryName;
    private final String gitDiffDelta;
    private final LocalDateTime timestamp;
    private boolean compliant;

    public CommitValidation(UUID traceId, String repositoryName, String gitDiffDelta) {
        this.validationId = UUID.randomUUID();
        this.traceId = traceId;
        this.repositoryName = repositoryName;
        this.gitDiffDelta = gitDiffDelta;
        this.timestamp = LocalDateTime.now();
        this.compliant = false;
    }

    public void evaluateCompliance(boolean hasViolations) {
        this.compliant = !hasViolations;
    }

    // Clean structural getters providing telemetry metrics directly to the chassis
    public UUID getValidationId() { return validationId; }
    public UUID getTraceId() { return traceId; }
    public String getRepositoryName() { return repositoryName; }
    public String getGitDiffDelta() { return gitDiffDelta; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public boolean isCompliant() { return compliant; }
}
