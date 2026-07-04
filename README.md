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
![FastAPI](https://img.shields.io/badge/FastAPI-005571.svg?style=for-the-badge&logo=fastapi)
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
* **Sovereign AI Ecosystem:** I am engineering [neurodoc-ai](https://github.com/caballeroluis/neurodoc-ai) — An enterprise-grade, 100% on-premise Homelab architecture designed to intercept code quality governance directly inside pre-flight CI/CD pipelines. Built via an ultra-low-overhead polyglot stack utilizing Java/Spring Boot 3 for the core business domain, native Rust for the pipeline interceptor, and a statically linked C engine (`codebase-memory-mcp`) to manage graph context, with local semantic reasoning driven by a custom-compiled `llama.cpp` runtime running `Hermes Agentic` weights.
* **Hybrid Integration Pipeline:** A Gitea/GitHub Self-Hosted Runner agent integrated into the local node. It executes builds, linters, and architectural tests utilizing local compute resources to prevent third-party platform billing.
* **Dedicated Local Inference:** Hybrid AI processing using local infrastructure mapped alongside external high-efficiency APIs. The ecosystem evaluates token-per-second throughput and context window footprints on restricted local hardware constraints to benchmark precise scalability metrics, calculating cost-to-performance ratios before provisioning larger enterprise nodes.
* **Local-First PaaS Orchestration (Coolify & Podman Core):** To completely avoid manual runtime maintenance and eliminate third-party deployment dependencies, the entire ecosystem is orchestrated via a self-hosted `coolify` instance running natively on the Debian host. Runtimes are managed through a secure, rootless `podman` container engine, providing localized multi-tenant delivery, automated volume mapping, and internal isolated routing with absolute data privacy and zero cloud telemetry leakage.

---

## Targeted Core Use Cases & Solved Market Flaws

The ecosystem applies a *Forward Deployed Engineer* mindset by deploying highly specialized modules addressing three real-world sectors:

### 1. For Software Developers (Active Code Governance & Environmental Memory)
* **The Problem:** Exponential technical debt degradation across enterprise repositories due to unregulated code injection from generative AI tools. Short-lived commercial AI assistants function within static silos, treating every prompt as a blank slate. Lacking a persistent memory of the project environment, they introduce volatile 'Auto-Fix' code patches under tight delivery deadlines.
- **The NeuroDoc Solution:** Intercepción automática mediante binario `ai-governance` en Rust que analiza deltas de git en cada commit. Evitando middleware pesado, el sistema logra latencia cero en hardware local. Un interceptor nativo procesa estructuras AST antes de la ejecución LLM, anclando el flujo al contexto global en ChromaDB. El cumplimiento semántico final se delega a un `llama.cpp` compilado a medida ejecutando `Hermes Agentic` en C/C++, bloqueando commits en milisegundos y optimizando la VRAM local.

### 2. For Bike Shops / Specialized Retailers (Inventory & Cash Flow Optimization)
* **The Problem:** Recurrent cash flow crunches triggered by passive procurement management. This leads to costly out-of-stock scenarios during high-demand peaks alongside stagnant capital tied up in low-turnover items.
* **The NeuroDoc Solution:** Predictive data analytics module. It ingests historical point-of-sale (POS) data through analytic pipelines, rendering demand forecasts that optimize Just-In-Time (JIT) stock restocking while protecting the business's working capital.

### 3. For Major Legal Consulting Firms (Data Sovereignty & Sealed RAG)
* **The Problem:** Inability to leverage large language models for internal contract audits due to severe compliance risks regarding public cloud data leaks, professional secrecy, and strict GDPR requirements.
* **The NeuroDoc Solution:** A secure enterprise On-Premise RAG platform. It implements metadata-driven multi-tenant isolation. Document ingestion of jurisprudence and LLM inference occur entirely within the boundaries of the physical On-Premise server, ensuring absolute client privacy.

---

## The Three-Tier Evaluation Loop

NeuroDoc AI rejects blind LLM orchestration. To minimize latency, save VRAM, and avoid token-drain, the governance loop splits code validation into three isolated steps, separating deterministic calculations from semantic reasoning.

In practice, this loop shifts architecture guidelines from dead documentation into executable guardrails: the system matches live git diffs against the senior engineering team's explicit rules stored in `/docs`, automating the pull request compliance audit before any code hits the remote repository.

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

* Have a optimization or want to propose **[IDEA-004]**? Open an Issue or submit a Pull Request to pitch your design framework.*

##  Roadmap Milestones & Horizon (In Development)

* [ ] **Phase 1: Core Infra Setup** – Unified Docker orchestration of **Gitea Platform**, ChromaDB, PostgreSQL (pgvector), and the Cloudflare Tunnel engine.
* [ ] **Phase 2: Git Interceptor Core** – Finalizing the native `ai-governance` Rust component for efficient `git diff` analysis.
* [ ] **Phase 3: Standardized C-MCP Layer** – Deploying the statically linked C Model Context Protocol engine to stream unified compliance rules to third-party IDE nodes.
* [ ] **Phase 4: Architecture Metrics Dashboard** – Frontend UI to track core domain coupling and monitor linting compliance scores across repository branches.
* [ ] **Phase 5: Multi-Tenant Data Isolation** – Implementing Row-Level Security (RLS) in PostgreSQL and metadata namespaces in ChromaDB to guarantee strict tenant partition.

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
  * **The Enforcement:** The vector database (**ChromaDB**) indexes the update instantly. On the very next git push event, the native Rust interceptor captures the delta stream, validates it against the fresh architectural axioms, and automatically rejects the commit. The junior is instantly blocked from deploying anti-patterns without requiring manual senior code review.

- [ ] **Target Demo 04: The Environmental Memory Graph Sync (For Software Developers)**
  * **The Setup:** Open separate isolated development environments on a complex repository mesh.
  * **The Action:** The developer prompts the local agent to refactor a legacy hexagonal port. Instead of generating generic code, the native C-MCP server queries the local persistent knowledge graph via Cypher to instantly feed the IDE context window with precise cross-service HTTP routes and call-graph dependencies.
  * **The Target:** Eliminate context blindness and achieve a 99% reduction in token consumption by avoiding raw file-by-file text scraping and replacing traditional read loops with structural graph diffusion before core model inference.

- [ ] **Target Demo 05: The Seasonal Parts Restocking Simulator (For Bike Shops)**
  * **The Setup:** Connect a local point-of-sale (POS) mock database containing 3 years of workshop repair tickets and groupset inventory history.
  * **The Chaos:** Simulate an overnight pricing volatility surge or supply chain bottleneck from major component manufacturers right before the seasonal repair peak.
  * **The Recovery:** The GPU-accelerated analytical engine running native JNI/cuDF bindings executes localized predictive forecasting over the tokenized data. It generates an optimized, prioritized JIT procurement schedule directly to the workshop's ledger, preventing active capital immobilization in low-turnover items.

- [ ] **Target Demo 06: Zero-Knowledge Jurisprudence Audit (For Legal Consulting Firms)**
  * **The Setup:** Ingest 10,000 pages of sensitive, highly confidential corporate contracts and jurisprudence data inside the local network perimeter.
  * **The Action:** Run a deep compliance and audit query from an external legal workstation targeting the local model endpoint.
  * **The Security:** The metadata-driven multi-tenant layer completely seals the request. The entire embedding generation, vector matching inside ChromaDB, and LLM inference occur strictly within the physical boundaries of the local bare-metal server, proving zero telemetry packets leakage to public cloud infrastructure.
  
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
