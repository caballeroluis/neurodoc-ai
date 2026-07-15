package com.neurodoc.governance.infrastructure.adapter.in.web.dto;

/**
 * Inbound infrastructure DTO encapsulating the structured telemetry metrics sent by the federated client.
 * Directly maps the typed deterministic payload parameters required by the CodeValidatorPort execution gateway.
 */
public record CommitValidationRequest(
    String componentLayer,
    double vectorDistance,
    int crossLayerDependencies
) {}
