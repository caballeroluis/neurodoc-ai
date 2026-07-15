package com.neurodoc.governance.domain.port;

/**
 * Pure inbound port enforcing deterministic Hexagonal Architecture isolation.
 * Resolves AI non-determinism by processing strictly typed compliance metrics.
 */
public interface CodeValidatorPort {
    
    /**
     * Evaluates incoming structured metadata parameters against strict domain logic rules.
     * Prevents "Plausible Code" by checking static architectural layers and vector distances.
     * 
     * @param componentLayer The target architectural layer identified (e.g., "DOMAIN", "INFRASTRUCTURE").
     * @param vectorDistance The distance score returned by ChromaDB against style guides (0.0 to 1.0).
     * @param crossLayerDependencies Detected illegal token references between decoupled packages.
     * @return Deterministic evaluation verdict (TRUE if approved, FALSE if blocked).
     */
    boolean evaluateDeterministicCompliance(String componentLayer, double vectorDistance, int crossLayerDependencies);
}
