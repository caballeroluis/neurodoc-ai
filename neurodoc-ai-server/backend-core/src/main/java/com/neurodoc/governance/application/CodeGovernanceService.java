package com.neurodoc.governance.application;

import com.neurodoc.governance.domain.model.CommitValidation;
import com.neurodoc.governance.domain.port.CodeValidatorPort;
import java.util.UUID;

/**
 * Application use case layer orchestrating deterministic architectural governance loops.
 * Implements the inbound framework-less port interface to validate extracted metadata.
 */
public class CodeGovernanceService implements CodeValidatorPort {

    @Override
    public boolean evaluateDeterministicCompliance(String componentLayer, double vectorDistance, int crossLayerDependencies) {
        // Initialize the domain model with ephemeral trace IDs for transactional relational logging
        UUID traceId = UUID.randomUUID();
        String summaryPayload = String.format("Layer: %s, Distance: %.4f, Deps: %d", componentLayer, vectorDistance, crossLayerDependencies);
        CommitValidation validation = new CommitValidation(traceId, "neurodoc-ai-repo", summaryPayload);
        
        // Strict deterministic guardrail metrics from core repository specifications:
        // 1. If the style-guide cosine similarity distance score inside ChromaDB exceeds the 0.7 threshold, treat it as anomalous code.
        // 2. If cross-layer references expose forbidden coupling dependencies between decoupled packages, reject the transactional block.
        boolean hasViolations = (vectorDistance > 0.7) || (crossLayerDependencies > 0);
        
        validation.evaluateCompliance(hasViolations);
        
        // Returns the pure isolated core kernel verdict directly to the outbound infrastructure adapter
        return validation.isCompliant();
    }
}
