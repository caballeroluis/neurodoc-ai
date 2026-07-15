I have seen this explode in production more times than I care to admit. The use of `@Transactional` is widespread, but few understand that it operates via AOP proxies. If a junior does not comprehend this mechanism, they will destroy database consistency on their very first push.

### PROBLEM 1: Internal Method Invocation (Self-Invocation Bypass)
* **The Junior Error**: Placing `@Transactional` on a method and calling it from another method that resides within the same class.
* **Why it breaks in production**: The execution bypasses the dynamic proxy entirely. The transaction interceptor never fires, and no transaction is opened. The code executes in plain text. If the process fails halfway through, you end up with inconsistent partial writes.
* **The Mandatory Resolution**: 
    1. Extract the transactional method into a separate component or bean to force the execution through the proxy infrastructure.
    2. Alternatively, use explicit programmatic transactions by injecting `TransactionTemplate` into the constructor.

### PROBLEM 2: The Checked Exception Blindspot
* **The Junior Error**: Assuming that any error or exception triggered inside the execution flow will automatically activate the database rollback sequence.
* **Why it breaks in production**: By default, the proxy only reverts the data state upon intercepting unchecked errors (RuntimeException and Error). Checked Exceptions (such as a standard IOException or controlled business logic exceptions) are completely ignored, meaning the corrupt or partial state is committed anyway.
* **The Mandatory Resolution**: Explicitly declare the rollback boundary rules in the annotation using: `@Transactional(rollbackFor = Exception.class)`.

### CI/CD GATEWAY RULE (Repository Enforcer)
Every pull request modifying the persistence layer must be rejected immediately if it includes internal transactional method calls or lacks the `rollbackFor` directive on methods exposed to checked exceptions.
