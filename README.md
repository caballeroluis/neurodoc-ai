# NeuroDoc AI • Next-Gen Hybrid Infrastructure & AI Governance
> **Enterprise Homelab Architecture for Autonomous Sovereign Code Governance** (In Brainstorming Phase)

![Debian](https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white)
![Gitea](https://img.shields.io/badge/Gitea-34495E?style=for-the-badge&logo=gitea&logoColor=5D9425)
![GitHub Actions](https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Cloudflare](https://img.shields.io/badge/Cloudflare-F38020?style=for-the-badge&logo=Cloudflare&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Rust](https://img.shields.io/badge/rust-%23000000.svg?style=for-the-badge&logo=rust&logoColor=white)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)
![C](https://img.shields.io/badge/c-%2300599C.svg?style=for-the-badge&logo=c&logoColor=white)
![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

NeuroDoc AI is an enterprise-grade reference ecosystem for hybrid engineering designed to resolve business inefficiencies and automate code governance using local On-Premise Artificial Intelligence. The project prioritizes absolute data sovereignty, strict multi-tenant isolation, and strict cloud cost optimization through a decoupled architecture running on self-hosted hardware.

> 💡 **Architectural Background & Vision:** The term **"Doc"** in NeuroDoc AI represents the bridging mechanism between static enterprise engineering guidelines (stored in `/docs`) and automated Dockerized infrastructure enforcement.

---

## Master Roadmap & Target Architecture

The backend ecosystem strictly rejects monolithic package structures that grow indefinitely. Instead, it implements a strict **Vertical Slicing** pattern combined with **Screaming Architecture** principles. The code is sliced by business domains rather than technical layers, turning the application into highly cohesive, promotion-ready microservices modules.

```text
neurodoc-ai/
├── .github/workflows/         <-- CI/CD: Public showcase pipeline (Automated testing gates)
├── .gitea/workflows/          <-- CI/CD: On-Premise GitOps engine (Hermetic local execution)
├── ai-governance/             <-- Edge CI/CD Gateway: Low-overhead pipeline interceptor (Rust)
│   └── src/main.rs            <-- Blistering fast 'git diff' stream capture & data encoding
├── cbm-knowledge-graph/       <-- Statically linked C codebase-memory MCP server
├── frontend-control/          <-- Presentation Layer: Visual Dashboard (Agility Semaphores)
├── docs/                      <-- Engineering Knowledge Base (Indexed into ChromaDB Vector Store)
│   ├── 01-isolation-rules.md  <-- Core domain isolation metrics
│   └── 02-hexagonal-layers.md <-- Interface plugs and hardware technical specifications
├── infra/                     <-- Homelab Orchestration Hub
│   └── docker-compose.yml     <-- Local network topology & cross-runtime persistence layers
│
└── backend-core/              <-- The Single Source of Truth: Core Domain (Spring Boot 3)
        ├── governance/        <-- Slice 01: Active Code Governance
        │   ├── domain/        <-- Pure Framework-less Business Rules (Compliance axioms)
        │   │   ├── model/     <-- Domain entities and value objects
        │   │   └── port/      <-- Inbound/Outbound interface definitions
        │   │       └── CodeValidatorPort.java <-- Active interface rule definition
        │   ├── application/   <-- Use Cases (Orchestrating code enforcement loops)
        │   └── infrastructure/<-- Ports & Adapters (ArchUnit engines, Spring configuration)
        ├── analytics/         <-- Slice 02: Predictive Forecasting (Bike Retail POS pipelines)
        │   ├── domain/        <-- Demand forecasts and inventory JIT cash-flow math
        │   ├── application/   <-- Use Cases (Calculate seasonal restocking schedules)
        │   └── infrastructure/<-- Ports & Adapters (POS mock DB adapters, ledger connectors)
        ├── legal/             <-- Slice 03: Sealed RAG Platform (Jurisprudence audit)
        │   ├── domain/        <-- Strict metadata-driven multi-tenant isolation rules
        │   ├── application/   <-- Use Cases (Contract compliance scanning, file ingestion)
        │   └── infrastructure/<-- Ports & Adapters (On-Premise PDF extractors, local isolation)
        └── shared/            <-- Cross-cutting structural utilities (Kernel-level common code)
```

---

## Homelab Infrastructure & Zero-Trust Stack

The bare-metal environment is engineered under enterprise standards to completely mitigate the financial drain of third-party cloud credits:

* **Bare-Metal OS & Orchestration:** Central host managed via Docker Compose. Hybrid persistence is achieved using ChromaDB (semantic RAG orchestration) coupled with PostgreSQL + pgvector (correlated relational data).
* **Private GitOps Hub (Gitea Engine):** Self-hosted Gitea service running locally as a mirror/alternative to cloud services. It coordinates internal repository trees and runs Gitea Actions pipelines natively, operating with full sovereignty inside the local area network.
* **Zero-Trust Network Governance:** Edge routing secured by a Cloudflare Tunnel (cloudflared). This routes incoming HTTPS traffic safely and exposes traditional web services (such as Gitea web interface and backend components) without opening residential ports or revealing the host's public IP address.
* **Sovereign AI Ecosystem:** I am engineering [neurodoc-ai](https://github.com/caballeroluis/neurodoc-ai) — An enterprise-grade, 100% on-premise Homelab architecture designed to intercept code quality governance directly inside pre-flight CI/CD pipelines. Built via an ultra-low-overhead polyglot stack utilizing **Java/Spring Boot 4.1.0** for the core business domain orchestration, native Rust for the pipeline interceptor, and a statically linked C engine ([codebase-memory-mcp](https://github.com/DeusData/codebase-memory-mcp)) to manage graph context, with local semantic reasoning driven by a custom-compiled [llama.cpp](https://github.com/ggml-org/llama.cpp) runtime running [Hermes Agentic](https://github.com/NousResearch/hermes-agent) weights.
* **High-Performance Communication Metal (gRPC Native):** Inter-process communication between the Rust native edge interceptors and the Java core orchestrator is fully decoupled via native, auto-configured gRPC channels. This architecture streams raw AST syntactical tokens directly to the JVM, eliminating HTTP routing overhead and JSON/XML serialization latency at machine speed.
* **Perimetric SSRF Firewall Guards:** External calls and hot-swappable cloud model adapters are secured at the ingress boundary utilizing Spring Boot 4.1's native Server-Side Request Forgery (SSRF) mitigation, establishing an immutable local network shield against prompt injection data-exfiltration exploits.
* **Hybrid Integration Pipeline:** A Gitea/GitHub Self-Hosted Runner agent integrated into the local node. It executes builds, linters, and architectural tests utilizing local compute resources to prevent third-party platform billing.
* **Dedicated Local Inference:** Hybrid AI processing using local infrastructure mapped alongside external high-efficiency APIs. The ecosystem evaluates token-per-second throughput and context window footprints on restricted local hardware constraints to benchmark precise scalability metrics, calculating cost-to-performance ratios before provisioning larger enterprise nodes.
* **Local-First PaaS Orchestration (Coolify & Podman Core):** To completely avoid manual runtime maintenance and eliminate third-party deployment dependencies, the entire ecosystem is orchestrated via a self-hosted `coolify` instance running natively on the Debian host. Runtimes are managed through a secure, rootless `podman` container engine, providing localized multi-tenant delivery, automated volume mapping, and internal isolated routing with absolute data privacy and zero cloud telemetry leakage.

---

## Targeted Core Use Cases & Solved Market Flaws

The ecosystem applies a *Forward Deployed Engineer* mindset by deploying highly specialized modules addressing three real-world sectors:

### 1. For Software Developers (Active Code Governance & Environmental Memory)
* **The Problem:** Exponential technical debt degradation across enterprise repositories due to unregulated code injection from generative AI tools. Short-lived commercial AI assistants function within static silos, treating every prompt as a blank slate. Lacking a persistent memory of the project environment, they introduce volatile 'Auto-Fix' code patches under tight delivery deadlines.
* **The NeuroDoc Solution:** Intercepción automática mediante binario `ai-governance` en Rust que analiza deltas de git en cada commit. Evitando middleware pesado, el sistema logra latencia cero en hardware local. Un interceptor nativo procesa estructuras AST antes de la ejecución LLM, mapeando dependencias exactas en sub-milisegundos a través de un motor en C estático (`codebase-memory-mcp`). El cumplimiento semántico final se delega a un `llama.cpp` compilado a medida ejecutando `Hermes Agentic` en C/C++, bloqueando commits en milisegundos y optimizando la VRAM local.

### 2. For Bike Shops / Specialized Retailers (Inventory & Cash Flow Optimization)
* **The Problem:** Recurrent cash flow crunches triggered by passive procurement management. This leads to costly out-of-stock scenarios during high-demand peaks alongside stagnant capital tied up in low-turnover items.
* **The NeuroDoc Solution:** Predictive data analytics module. It ingests historical point-of-sale (POS) data through analytic pipelines, rendering demand forecasts that optimize Just-In-Time (JIT) stock restocking while protecting the business's working capital.

### 3. For Major Legal Consulting Firms (Data Sovereignty & Sealed RAG)
* **The Problem:** Inability to leverage large language models for internal contract audits due to severe compliance risks regarding public cloud data leaks, professional secrecy, and strict GDPR requirements. Traditional vector RAG systems fail here because flat keyword matches lack the capacity to link separate, non-linear jurisprudence or overlapping contractual clauses.
* **The NeuroDoc Solution:** A secure enterprise On-Premise Sealed RAG platform that structures text intelligence via a Local Semantic Knowledge Graph. Document ingestion of jurisprudence and sensitive corporate contracts are parsed into a network of explicitly typed conceptual edges (`refuerza`, `contrasta_con`), enabling deep compliance audits. Inference occurs entirely within the physical boundaries of the local bare-metal server executing via `llama.cpp` with zero data telemetry leakage.
### 4. For Enterprise IT Directors & CFOs (FinOps Optimization & Targeted VRAM Multi-Tenancy)

* **The Market Flaw:** Massive financial drain caused by the "Inference Idle Tax" in centralized cloud infrastructures. Corporations rent expensive cloud GPU clusters (paying for 730 hours/month) only to realize their actual development pipelines run at a miserable 10-12% utilization capacity during intermittent working shifts. Furthermore, scaling concurrent agentic code pipelines (which inject contexts from 32K up to 128K tokens) exponentially breaks the shared VRAM footprint due to massive KV Cache storage, causing sudden Out-Of-Memory (OOM) cluster crashes.
* **The NeuroDoc Architectural Blueprint:** An asynchronous scheduling layer designed to integrate natively into Spring Boot 4.1. By decoupling prompt persistence to the client's local storage (HDD/SSD) and utilizing a centralized Debian CUDA node solely for instantaneous, sequential forward passes via LiteLLM, the ecosystem is architected to bypass layer-7 load balancing overhead and shared multi-tenant memory fragmentation. This blueprint targets effectively squeezing 100% of internal idle hardware at a strict $0 marginal token cost.


---

## The Three-Tier Evaluation Loop

NeuroDoc AI rejects blind LLM orchestration. To minimize latency, save VRAM, and avoid token-drain, the governance loop splits code validation into three isolated steps, separating deterministic calculations from semantic reasoning.

In practice, this loop shifts architecture guidelines from dead documentation into executable guardrails: the system matches live git diffs against the senior engineering team's explicit rules stored in `/docs`, automating the pull request compliance audit before any code hits the remote repository.

### The Dual-Engine Graph Architecture (Context Isolation & Semantics)

To achieve absolute multi-tenant data sovereignty and completely eliminate cross-tool context blindness across distinct pipelines, the reference design enforces a non-competing, dual-graph parsing strategy before committing resources:

* **The Code Footprint (Structural AST):** Managed natively by a statically linked C engine (`codebase-memory-mcp`). It extracts repository structures, tracking strict code dependencies (`CALLS`, `IMPORTS`, `INHERITS`) directly from the source file layouts using Tree-sitter. This deterministic layer handles massive enterprise code repositories at $0 cloud OpEx, slicing prompt token consumption by 99% by serving only the exact lines of code required for validation.
* **The Core Knowledge (Semantic Graph):** Modeled after enterprise-grade open-source graph frameworks like [Graphify-Labs/graphify](https://github.com/Graphify-Labs/graphify?ref=aiposthub.com). It parses unstructured corporate documentation, legal compliance guidelines, and architecture axioms into a typed concept network with directional edges (`refuerza`, `contrasta_con`). By routing the backend variables via local network configurations (`OPENAI_BASE_URL` targeting a self-hosted `llama.cpp` instance running `Hermes Agentic` weights), the system executes non-linear reasoning over thousands of sensitive pages (Target Demo 06) with absolute zero telemetry leakage.
* **The Paradigm Invariant:** Code isolates the exact structural map of the repository infrastructure; Semantics governs the cognitive map of the business domain guidelines.

> [!TIP]
> **Maximize Pipeline Precision:** Feed the `/docs` incubator with highly modular, isolated markdown files (e.g., explicit layer boundary definitions, concrete security annotation requirements, or naming conventions). The more atomic and clear the senior team's written constraints are, the more precise the mathematical vector retrieval becomes in Phase 2, resulting in zero LLM hallucinations during final inference.

### 1. Phase 1: Stream Capture & Native Enforcement (Zero-AI Overhead)
The compiled native Rust ai-governance binary intercepts the git diff stream at the git hook perimeter. While commercial AI assistants rely on heavy abstract layers and cloud Webhooks that bloat pipelines and skyrocket operational lag, NeuroDoc AI enforces an ultra-lean, native Rust interceptor directly inside the pre-flight cycle.

It captures live `git diff` deltas, strips binary noise, and processes AST (Abstract Syntax Tree) structures deterministically before any LLM execution. By bypassing heavy middleware and skipping non-essential, cloud-dependent protocol abstraction layers, the system achieves pure local isolation with zero latency. If a commit violates the sovereign architectural rules, the Rust gate drops the payload in milliseconds, saving massive inference costs by preventing junk code from ever hitting the local LLM core.

### 2. Phase 2: Context Retrieval (Zero-LLM Compute)
The backend core takes the structural footprint from Rust and generates a dense vector embedding of the code delta. It triggers a mathematical cosine-similarity query against ChromaDB / PostgreSQL (pgvector) to fetch the exact architectural guidelines from the `/docs` folder that match the modified code. This relies entirely on database-optimized linear algebra, bypassing the LLM completely.

### 3. Phase 3: Local Semantic Inference (Targeted VRAM)
Only when explicit architectural rules are retrieved from the vector store, a highly optimized, custom-compiled `llama.cpp` runtime executing `Hermes Agentic` weights is triggered inside the Homelab perimeter. The system completely bypasses generic, heavy commercial wrappers. Instead, the model fires selectively via Mixture of Experts (MoE) topologies and Multi-Token Prediction (MTP), receiving a highly restricted context window containing only the target git diff delta and the isolated guidelines. It evaluates structural compliance and returns a deterministic engineering justification in milliseconds, keeping the entire cluster workload under a strict 170W operational threshold.

> [!NOTE]
> **Model Efficiency & Scaling Axiom:** Modern specialized code models (such as 7B or 14B localized Coder weights) demonstrate near-parity with massive cloud frontier models when tasked with static analysis and syntactic compliance. You do not need the financial drain of a GPT-4o instance to detect an unsecured API endpoint or a broken layer boundary; a localized coder model captures these violations flawlessly if provided with the precise context window. *[Architectural Status: Comprehensive field-testing for multi-language syntax thresholds is currently pending on the active roadmap].*

---

## Stay Tuned & Follow Development

The ecosystem is built openly in a **Building in Public** fashion. To monitor real-time architectural changes, system updates, and roadmap iterations:
* Click the **Watch** button at the top right of this repository.
* Select **Custom -> Commits** to subscribe directly to the engineering file history and track the system's live evolution.

---

## Enterprise Production Deployment & Integration

The ecosystem is architected under the **interchangeable parts principle**, meaning the core domain logic remains strictly decoupled from edge infrastructure providers. To transition this baseline Homelab blueprint into a corporate enterprise environment, only the outer infrastructural adapters require modification without inducing pipeline latency:

1. **Edge Routing & Ingress:** The default `cloudflare_tunnel` container can be removed from `docker-compose.yml`. In a corporate network, incoming data packets are securely routed by pointing the application runtimes behind the company's internal API Gateways, Reverse Proxies (NGINX, HAProxy), or specialized VPN/Direct Connect paths.
2. **GitOps Pipeline Orchestration:** The pre-flight quality gate files are explicitly decoupled. Teams can seamlessly migrate from the local network **Gitea Actions** workflow (`.gitea/workflows/`) to cloud-managed corporate environments like **GitHub Actions**, GitLab CI, or Bitbucket Pipelines by registering enterprise Self-Hosted Runners operating on top of bare-metal machines.
3. **High-Performance Local Persistence Scaling:** To guarantee ultra-low latency inside the active code execution loop, vector context compliance (**ChromaDB / pgvector**) remains strictly localized within the client's internal network mesh (LAN/On-Premise cluster). External enterprise datastores are integrated solely as asynchronous, non-blocking outbound adapters for long-term analytical metric storage, ensuring zero pipeline serialization delays during commit evaluation.

---

## Disclaimer & Legal Liability

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

---

## Architectural Incubator: Decentralized Design Framework

This section operates as an open technical sandbox for experimental blueprints. Community members and system architects are welcome to submit critiques, alternative topologies, or brand-new paradigm designs by opening an Issue labeled with the next chronological index.

### [IDEA-001] The Gamers Compute Grid (Crowdsourced VRAM Mining)

#### Origin of the Idea: Real-World Infrasignment
This architecture paradigm was conceived following a technical alignment discussion with software engineer Franco Ariel Marcuzzi regarding his `franco-proxy-llm` project. Franco encountered a recurrent corporate bottleneck: the company's servers lacked AI compute capacity, forcing him to securely expose his personal home hardware via an API-key proxy to salvage a backend production demo. 

By analyzing his infrastructure topology, **NeuroDoc AI** expanded the framework from a single-machine emergency proxy into a standardized, multi-node decentralized cluster model that companies can leverage natively.

* **Status:** Conceptual Draft / Architectural Design Phase
* **Target Flaw:** Critical high-concurrency VRAM bottlenecks during enterprise operational peaks without scaling corporate data center CapEx.

#### The Philosophy: Monetizing Idle Gaming Hardware
Most software engineers and tech-industry professionals own high-end personal gaming setups at home equipped with massive consumer GPUs (e.g., NVIDIA RTX 3090, 4080, 4090) that sit completely idle during standard working hours. Instead of forcing the enterprise to purchase expensive cloud clusters or private server farms, **NeuroDoc AI** proposes an abstract, interchangeable compute grid utilizing distributed consumer hardware.

```text
 [ Corporate Codebase ] ── (Semantic Load Balancer) ──► [ Encrypted Git Diff Packets ]
                                                                 │
         ┌───────────────────────────┬───────────────────────────┴───────────────────────────┐
         ▼                           ▼                           ▼                           ▼
 🔒 (Corporate VPN Tunnel)   🔒 (Corporate VPN Tunnel)   🔒 (Corporate VPN Tunnel)   🔒 (Corporate VPN Tunnel)
         │                           │                           │                           │
 [ Dev 1: Home Rig ]         [ Dev 2: Home Rig ]         [ Dev 3: Home Rig ]         [ Dev 4: Home Rig ]
 (vLLM • PagedAttention)     (vLLM • PagedAttention)     (vLLM • PagedAttention)     (vLLM • PagedAttention)
```

#### Technical Mechanics under Two-Tier Load Balancing:
1. **The Sovereign Private Node:** Employees register their personal home Homelab machines by joining the encrypted corporate VPN overlay. Each home node spins up a hermetic, lightweight NeuroDoc slave container that communicates strictly within the private network perimeter, exposing the local CUDA runtime exclusively to the corporate core without open residential ports or third-party public cloud routing.
2. **Two-Tier Balanced Inference (Network + Hardware Cascade):**
   * **Level 1 (Network Load Balancing):** The Spring Boot core domain at the office treats these home nodes as abstract infrastructural adapters. When a commit push triggers an asset check, the central balancer routes the text delta to whichever employee's home machine has idle capacity.
   * **Level 2 (Local GPU Optimization via vLLM):** To prevent multiple simultaneous network requests from crashing a single developer's machine, each home container runs **vLLM** instead of standard single-user inference engines. By leveraging **PagedAttention**, the home node slices its VRAM (e.g., an RTX 3090's 24GB) into virtual memory pages, managing parallel user queries concurrently without triggering Out-Of-Memory (OOM) crashes.
3. **The "Proof-of-Inference" Payroll Incentive:** The platform monitors the exact number of tokens processed by each node. Instead of mining traditional volatile cryptocurrencies, workers "mine" internal corporate credits, translating into direct financial bonuses on their monthly payroll to subsidize hardware depreciation and domestic electricity costs.

This framework shifts corporate infrastructure scaling: This offers a decentralized, zero-cloud-cost compute alternative, while engineering teams monetize their hardware assets during the day.

---

### [IDEA-002] The Asymmetric Failover Engine (Mitigating Procedural Lock-In)

#### Origin of the Idea: Real-World Infrasignment
This architecture paradigm was conceived following the geopolitical and operational volatility observed in June 2026, specifically the sudden US export-control directive that forced the immediate suspension of frontier models like Claude Fable 5 for foreign nationals. This event proved that relying 100% on external cloud APIs introduces an unacceptable systemic business continuity liability. When centralized endpoints change, degrade, or face perimeter lockdowns, corporate operations freeze instantly.

* **Status:** Conceptual Draft / Architectural Design Phase
* **Target Flaw:** Procedural lock-in, API saturation, and sudden capability interruptions in critical enterprise, legal, or financial pipelines.

#### The Philosophy: Local Metal as the Single Source of Truth
Most organizations treat local AI infrastructure as an afterthought or a secondary alternative. **NeuroDoc AI** flips the paradigm: an On-Premise sovereign layer (running hermetically via local hardware) operates as the permanent, unchanging baseline of the entire architecture. Public frontier cloud APIs are treated purely as a volatile, temporary acceleration layer. If the external API drops, shifts its data policy, or prices skyrocket due to global endpoint saturation, the core pipeline never stops.

```text
  [ Incoming Code/Commit Delta ]
                │
                ▼
   (Hexagonal Routing Domain)
                │
     ┌──────────┴────────────────────────┐
     │ (Cloud Stable & Compatible?)      │
     ▼                                   ▼
  [ YES ]                             [ NO ] ──► (Incompatible Update / Saturation Failover)
     │                                                     │
     ▼                                                     ▼
[ External Cloud Frontier API ]                  [ Sovereign Local Core ]
(High-Speed Acceleration)                        (Debian Mesh • llama.cpp • Hermes)
     │                                                     │
     ▼                                                     ▼
[ Volatile Inference / High Risk ]               [ Deterministic Baseline Support ]
                                                 (Maintains stable operations while 
                                                  cloud adapters are rewritten/fixed)

```

#### Technical Mechanics under Volatility Constraints:
1. **The Sovereign Invariant Base:** The central pipeline, vector validation rules, database structures (ChromaDB), and localized context models operate natively on local bare-metal. The business logic is 100% independent of foreign endpoints or cloud-layer software assumptions.
2. **Decoupled Asymmetric Failover:** While the cloud connection is active and stable, heavy migrations or multi-modal token requests are optionally routed externally to leverage raw cloud speed. However, the system actively mirrors the prompt topologies and governance rules inside the local core instance.
3. **Continuous Support Lifecycle:** The exact moment a remote kill-switch or export ban cuts access to the cloud model, the system executes an automated, zero-latency failover to the local bare-metal engine. Operations do not suffer a standstill. The local engine provides full operational continuity, serving as a protective buffer that keeps the engineering team 100% functional while the systems architects safely adapt or rewrite the external cloud adapters to the new market realities.

This framework ensures that technical agility is never rented: True sovereignty means managing model volatility as a hard design constraint from day zero, anchoring company operations in physical space rather than digital pixels.

---

### [IDEA-003] Token Gatekeeper Middleware (Ingress Prompt Guard)

#### Origin of the Idea: Real-World Infrasignment
This architecture paradigm was conceived following a technical discussion with infrastructure engineer Agustín regarding active runtime operations and perimeter guardrails. Agustín outlined the baseline vulnerability of exposing open LLM orchestrations to unchecked user streams. 

By analyzing his production deployment scenarios, **NeuroDoc AI** expanded the guardrail blueprint into a specialized local vector database layer (ChromaDB) that intercepts and validates document payloads at the ingress boundary, long before they consume external tokens or exhaust local VRAM parameters.

* **Status:** Conceptual Draft / Architectural Design Phase
* **Target Flaw:** Unregulated context footprint inflation, financial token-drain in public clouds, and hardware resource exhaustion during high-concurrency enterprise parsing operations.

#### The Philosophy: Enforcing Text-Only Low-Overhead Inputs
Generative AI orchestrations frequently fail or overspend because the system treats ingestion layers as open, unchecked endpoints. **NeuroDoc AI** proposes a lightweight middleware boundary layer that intercepts user requests at the API Gateway level before they ever hit the core inference cluster or cloud pipes. The system isolates data-extraction mechanics from generative pipelines, ensuring the model only receives lean, dense semantic tokens.

```text
  [ Raw User Request + 5MB PDF Blob ]
                   │
                   ▼
     (Token Gatekeeper Ingress Gate)
                   │
         (Binary Detected?)
          ├── [ YES ] ──► [ Sovereign Local Text Parser ]
          │               (Native Rust/C Raw Data Extraction)
          │                              │
          └── [ NO ]                     ▼
               │              [ Stripped Plain-Text Payload ]
               ▼
     (Check Token Budget / Semaphore Enforcer)
               │
      ┌────────┴────────┐
      ▼                 ▼
 [ Within Budget ]  [ Over Quota ] ──► [ Ingress Blocked ]
      │                                (Infrastructure Protection Error)
      ▼
 [ Core Inference / Cloud Pipe ]
```

#### Technical Mechanics under Resource Constraints:
1. **Binary Interception & Validation:** The middleware captures incoming input payloads at the network boundary. If a binary stream or unstructured document block is detected, the direct call to the core inference runtime or external cloud API is explicitly blocked at the ingress gate.
2. **Sovereign Local Text Parsing:** The blocked asset is instantly offloaded to a zero-overhead local parsing utility (utilizing lightweight, native Rust or C text-extraction binaries). This process isolates the raw text contents, stripping away visual styles, structural metadata, layouts, and binary media bloat natively within the local boundary.
3. **Token Budget Enforcement:** The resulting plain-text output is measured against a strict enterprise token-quota semaphore. If the calculated prompt context footprint remains within safe financial and local hardware parameters, the request is safely dispatched to the core pipeline; otherwise, it is rejected with an infrastructure protection error before consuming compute credits or saturating VRAM.

This framework ensures that enterprise intelligence never runs unmetered: True governance requires filtering raw payload inputs at the network perimeter, protecting compute resources from data-bloat vulnerabilities.

---

### [IDEA-004] AI-Native Runtime Control Plane & Ephemeral Sandbox (Delegated Agent Governance)

#### Origin of the Idea: Real-World Infrasignment
This architecture paradigm expands the standard Model Context Protocol (MCP) tool-calling lifecycle by incorporating an AI-native post-authentication Runtime Control Plane tailored for next-generation framework specifications. It targets the security vacuum that remains after an autonomous agent passes initial validation gates, preventing hallucinated or injected AI agents from executing unauthorized host mutations or privilege escalations (`sudo`, restricted directory writes) during long-lived concurrent sessions.

- **Status:** Conceptual Draft / Architectural Design Phase
- **Target Flaw:** Post-authentication privilege drift, uncontrolled autonomous sub-processes, and non-deterministic agent execution on host bare-metal infrastructure.

#### The Philosophy: Dynamic Runtime Constraints over Coarse ACLs
NeuroDoc AI treats autonomous delegated agents as inherently volatile. While the local model (INT4 Qwen Coder via native `llama.cpp` runtime) is constrained within raw C/C++ memory isolation boundaries, the execution layer enforces an ongoing runtime zero-trust mesh. The system continuously evaluates agent requests at method-level via `@Protectable` aspects—fully refactored and ported to run natively under Spring Boot 4.1.0 environments—moving beyond static rules into active real-time interception.

#### Technical Mechanics & Hybrid Execution Layers:
1. **JVM 4.1 Runtime Interception (`@Protectable`)**: The Spring Boot 4.1.0 core establishes a 5-action dynamic decision path (ALLOW · CHALLENGE · BLOCK · ESCALATE · PENDING). Tool-calling requests are dynamically parsed; if behavioral context drifts or an anomalous command sequence is generated, the runtime applies a `BLOCK` state to freeze the execution thread before it ever touches native OS pipes.
2. **Deterministic Command Whitelisting (Rust AST Guard)**: Allowed intents are tokenized by a statically linked Rust binary (`ai-governance`). Any command containing `sudo`, shell chaining markers, or modifications to host configurations (`/etc`, `/proc`) triggers an immediate infrastructure protection fault.
3. **Rootless Podman Isolation Sandbox**: Validated execution primitives are forcefully wrapped and executed inside ephemeral, rootless Podman container environments. The delegated agent interacts with a synthetic read-only view of the host, restricting exploitation surface to exactly $0 persistent system impact.

---

### [IDEA-005] KV-Cache Splitting Protocol (Asymmetric Context Slicing)

- **Status**: Conceptual Draft / Architectural Design Phase
- **Target Flaw**: Multi-tenant VRAM saturation and OOM drops on local hardware under concurrent long-context (32K+) reviews.
- **Ecosystem Compliance**: Maps into Kubernetes-native GPU-sharing layers (`HAMi / CNCF Incubating`) and engine-independent KV-cache managers (`LMCache / PyTorch Foundation`), structurally inspired by `spectrayan/spector`. Decouples volatile memory states to enable out-of-process daemon offloading spanning local RAM, SSD arrays, and continuous **PostgreSQL + pgvector** persistence layers.

#### Technical Mechanics & Layer-7 Core Routing:
1. **Asynchronous Pre-Parsing**: The Spring Boot 4.1.0 backend isolates incoming payloads, stripping static criteria (`/docs`) to process them independently via the native C-core engine (`codebase-memory-mcp`).
2. **Forward-Pass Slicing**: The native Rust handler streams block sequences into the `llama.cpp` runtime—staging the solution graph first and injecting code syntactical diff components exclusively during the forward pass.
3. **VRAM Flushing Loop**: Upon token compilation, the transient KV-Cache footprint is instantaneously flushed from graphic memory and serialized as binary vector tracks inside the PostgreSQL cluster at a flat token cost of $0.

### [IDEA-006] Anti-Synthetic Ingestion Filter (Structural Entropy Guard)

- **Status**: Conceptual Draft / Architectural Design Phase
- **Target Flaw**: Persistent vector space pollution, corporate data cannibalism, and semantic drift driven by repetitive code loops generated blindly by centralized cloud assistants.

#### Technical Mechanics & Verification:
1. **Entropy Auditing Interceptor**: The native `ai-governance` binary in Rust intercepts ingress Git diff strings, calculating structural entropy and measuring predictable mathematical syntax signatures.
2. **Deterministic Pre-Inference Evaluation**: If the syntactic composition yields a deterministic footprint matching low-entropy public templates, the engine flags the delta with an infrastructure warning.
3. **ChromaDB Exclusion Boundary**: Flagged code blocks execute locally but are strictly forbidden from indexing as persistent semantic anchors inside ChromaDB, preserving long-term core memory space exclusively for verified human engineering patterns.

---

### [IDEA-007] Zero-Trust Prompt Cleansing Mesh (Anti-Unicode Fingerprinting)

- **Status**: Conceptual Draft / Architectural Design Phase
- **Target Flaw**: Obfuscated binary backdoor execution, invisible Unicode signal fingerprinting, and untrusted runtime system prompt overwrites.

#### Technical Mechanics & Isolation Gates:
1. **Aspect-Oriented Input Sanitization**: Leveraging Spring Boot 4.1.0 aspects (`@Protectable`), all string payloads generated by execution tools or agent loops are intercepted post-authentication before downstream model evaluation, building upon the control plane runtime concepts of `contexa-security/contexa`.
2. **Lexical Laundering**: The string stream is piped into the native `ai-governance` Rust pipeline, stripping non-standard invisible homoglyphs, non-printing character sets, or hidden Unicode markers back to a deterministic state.
3. **Immutable Prompt Assertions**: Enforces strict compile-time template boundaries that prevent multi-agent or third-party binaries from rewriting system invariants at a flat token cost of $0.

---

### [IDEA-008] Bare-Metal Hardware Actuation Mesh (Sovereign KVM Isolation & Enterprise Compliance Enclosure)

- **Status**: Conceptual Draft / Architectural Design Phase
- **Target Flaw**: Software-defined container escapes, compute overhead of local guest hypervisors, and total endpoint security blindness during pre-boot states (BIOS/UEFI manipulation or unauthorized Live-USB ingestion).

#### Architectural Advantages vs Single-VM Isolation:
* **Zero Resource Tax**: Offloads 100% of the agent actuation load to detached secondary hardware, saving host CPU/VRAM threads to run deep **Mixture of Experts (MoE)** models locally.
* **True Physical Air-Gapping**: Eliminates hypervisor escape vectors by removing shared kernels, shared memory, and software virtualization layers from the primary host.
* **Pre-Boot & Bare-Metal Audit Rail**: Monitors target devices independently of the client OS status, capturing states continuously even during firmware access or external boot overrides.

#### Technical Mechanics & Hardware Actuation:
1. **Physical Input Injection**: The orchestrator has no direct file-system connection to the target machine. Instructions are translated into mechanical Keyboard/Video/Mouse (KVM) signals over a microcontroller (`NanoKVM-Go`), typing and clicking on the target metal via network-bound hardware emulation.
2. **Visual Feedback Loop (Pixel-Native Ingestion)**: The native Rust engine orchestrates screen analysis by leveraging a pixel-native retrieval architecture (inspired by Berkeley's `StarTrail-org/PixelRAG`). By streaming local frame captures directly into a localized Qwen3-VL-Embedding vision space, the system cross-references state changes and terminal layouts purely on raw pixel data, bypassing application-layer log injection vectors and hidden runtime rootkits.
3. **Hardware-Level Blast Radius**: Any compromise remains physically trapped inside the secondary piece of hardware. The master orchestrator trips power relays to hard-reset, isolate, or reflash the target device in milliseconds, ensuring a 0% structural risk to the core **master Debian host**.

---

* Have a optimization or want to propose **[IDEA-009]**? Open an Issue or submit a Pull Request to pitch your design framework.*

##  Roadmap Milestones & Horizon (In Development)

* [ ] **Phase 1: Core Infra Setup** – Unified Docker orchestration of **Gitea Platform**, ChromaDB, PostgreSQL (pgvector), and the Cloudflare Tunnel engine.
* [ ] **Phase 2: Git Interceptor Core** – Finalizing the native `ai-governance` Rust component for efficient `git diff` analysis.
* [ ] **Phase 3: Standardized C-MCP Layer** – Deploying the statically linked C Model Context Protocol engine to stream unified compliance rules to third-party IDE nodes.
* [ ] **Phase 4: Architecture Metrics Dashboard** – Frontend UI to track core domain coupling and monitor linting compliance scores across repository branches.
* [ ] **Phase 5: Multi-Tenant Data Isolation** – Implementing Row-Level Security (RLS) in PostgreSQL and multi-tenant concept isolation rules inside the Local Semantic Graph (`Graphify`) to guarantee strict partition of business intelligence and corporate documentation.

## Future Architectural Aspirations (Long-Term Demo Target)

- [ ] **Target Demo 01: The Router Firewall Fallback & Hardware Boot**
  * **The Setup:** Open the IDE and stream an active development prompt directed at a commercial cloud LLM endpoint.
  * **The Chaos:** Live-drop a firewall block ruleset directly inside the residential router interface to trigger an instant `Connection Refused` error on the cloud API.
  * **The Hexagonal Recovery:** The core domain intercepts the network timeout exception and fires an automated UDP Magic Packet—triggering either **Wake-on-LAN (WoL)** or **Wake-on-WAN (WoW)** depending on the node's network location. This boots the offline server host and seamlessly routes the context payload directly to the local custom-compiled `llama.cpp` / `Hermes Agentic` runtime.
  * **The Target:** Zero changes required on the developer's prompt or IDE configuration—true infrastructure decoupling via interchangeable adapters.

- [ ] **Target Demo 02: Crowdsourced VRAM Failover Grid**
  * **The Setup:** Simulate an incoming traffic spike by triggering 10 simultaneous repository push events (multi-user git diff streams).
  * **The Chaos:** Artificially saturate the memory constraints (OOM boundary) of a single employee's local development machine.
  * **The Recovery:** The centralized Go orchestrator dynamically opens outbound Cloudflare Tunnels toward active node rigs (e.g., a distributed RTX 3090 setup), partitioning the query load concurrently through **vLLM PagedAttention** over residential broadband latency.

- [ ] **Target Demo 03: Real-Time Governance Shift (The Junior Anti-Malpractice Gate)**
  * **The Setup:** A junior developer uses commercial generative AI assistants to aggressively inject code, inadvertently introducing bad practices, coupling anomalies, or architectural drift.
  * **The Action:** A senior architect drops a brand-new markdown style guide or infrastructure layout standard inside the local `/docs` folder. 
  * **The Enforcement:** The local semantic knowledge graph engine (`Graphify`) parses and indexes the update instantly into explicitly typed conceptual relations. On the very next git push event, the native Rust interceptor captures the delta stream, validates the structural AST against the fresh architectural axioms, and automatically rejects the commit. The junior is instantly blocked from deploying anti-patterns without requiring manual senior code review.

- [ ] **Target Demo 04: The Environmental Memory Graph Sync (For Software Developers)**
    - **The Setup:** Open separate isolated development environments across a highly complex repository mesh with evolving microservices modules.
    - **The Action:** The developer prompts the local agent tool to refactor a legacy hexagonal port interface. Instead of generating generic boilerplate, the integrated MCP server layer queries the dual-topology graph pipeline concurrently. It resolves strict code layouts via the native C-MCP engine (`codebase-memory-mcp`) while pulling architectural guidelines from the semantic concept mesh (`Graphify`).
    - **The Target:** Eliminate cross-tool context blindness and feed the IDE context window instantly with precise call-graph dependencies and explicit compliance rules. Achieve a 99% reduction in prompt token consumption by avoiding flat, file-by-file text scraping and replacing traditional read loops with targeted graph diffusion before core model inference.

- [ ] **Target Demo 05: The Seasonal Parts Restocking Simulator (For Bike Shops)**
  * **The Setup:** Connect a local point-of-sale (POS) mock database containing 3 years of workshop repair tickets and groupset inventory history.
  * **The Chaos:** Simulate an overnight pricing volatility surge or supply chain bottleneck from major component manufacturers right before the seasonal repair peak.
  * **The Recovery:** The GPU-accelerated analytical engine running native JNI/cuDF bindings executes localized predictive forecasting over the tokenized data. It generates an optimized, prioritized JIT procurement schedule directly to the workshop's ledger, preventing active capital immobilization in low-turnover items.

- [ ] **Target Demo 06: Zero-Knowledge Jurisprudence Audit (For Legal Consulting Firms)**
  * **The Setup:** Ingest 10,000 pages of sensitive, highly confidential corporate contracts and jurisprudence data inside the local network perimeter.
  * **The Action:** Run a deep compliance and audit query from an external legal workstation targeting the local model endpoint.
  * **The Security:** The metadata-driven multi-tenant layer completely seals the request. The integrated semantic knowledge graph navigates the non-linear network topology of the unstructured text, verifying clauses through conceptual connections without public cloud data leakage. The entire graph query loop and local LLM inference (`llama.cpp`) occur strictly within the physical boundaries of the local bare-metal server.
  
- [ ] **Target Demo 07: The Microservices Extraction & Commercial Packaging Gate (For B2B Enterprise Ventures)**
  * **The Setup:** A client (e.g., a Major Legal Consulting Firm) requests to license exclusively the On-Premise Sealed RAG framework, explicitly demanding the total removal of unrelated operational modules (such as Developer Governance or Bike Retail Predictive Analytics).
  * **The Action:** The engineer triggers a localized build extraction. Without refactoring, modifying, or rewriting a single line of core business logic, the outer technical layer unplugs the `governance` and `analytics` vertical slices from the repository tree.
  * **The Recovery via Hexagonal Design:** Because the system enforces strict **Vertical Slicing** and domain-level boundary isolation inside Spring Boot 3, the independent `legal` module coupled with the `shared` structural kernel remains completely functional. The package compiles immediately as a standalone, lightweight, single-tenant or multi-tenant deployment artifact ready for client delivery.
  * **The Target:** Prove zero cross-domain coupling and absolute architectural portability, converting a decentralized monorepo into modular, highly-monetizable enterprise assets in minutes.

- [ ] **Target Demo 08: The Transatlantic Time-Zone VRAM Sharing Gate (For Intra-Continental SMEs)**
  * **The Setup:** Two independent companies operating on identical Hexagonal implementations of NeuroDoc AI are located in different continents (e.g., Madrid, Spain and Bogotá, Colombia), creating a natural 5-to-7-hour time-zone offset.
  * **The Chaos:** Expensive multi-GPU rigs sit idle and underutilized overnight in Spain while the Colombian office faces heavy, concurrent mid-day agentic workloads that saturate local hardware constraints.
  * **The Recovery via Hexagonal Design:** The immutable core domain detects the regional shift automatically via network latency or clock telemetry timeouts. Because the business logic is strictly decoupled behind an abstract outbound adapter layer (Ports/Adapters), the system triggers an agile, automated hot-swap event. It detaches the offline European node infrastructure and instantly plugs in the transatlantic P2P compute fabric (`Exo/Podman mesh`) as the active resource adapter, scaling or shedding VRAM capacities in milliseconds without modifying a single line of core code.
  * **The FinOps Target:** Double the computational throughput of both regional nodes by swapping idle VRAM resources based on the rotation of the Earth. All data contexts are processed ephemerally inside the remote volatile memory layer and purged instantly upon execution completion, achieving absolute zero cross-border data persistence, zero cloud OpEx scaling, and complete infrastructure sovereignty.
