# NeuroDoc AI • Next-Gen Hybrid Infrastructure & AI Governance
> **The Project-Based Engineering Roadmap: Architecture, Homelab GitOps & Automated Pipeline Audit**

![Debian](https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white)
![Gitea](https://img.shields.io/badge/Gitea-34495E?style=for-the-badge&logo=gitea&logoColor=5D9425)
![GitHub Actions](https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Cloudflare](https://img.shields.io/badge/Cloudflare-F38020?style=for-the-badge&logo=Cloudflare&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Rust](https://img.shields.io/badge/Rust-%23000000.svg?style=for-the-badge&logo=rust&logo=rust&logoColor=white)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![FastAPI](https://img.shields.io/badge/FastAPI-005571.svg?style=for-the-badge&logo=fastapi)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Ollama](https://img.shields.io/badge/ollama-%23000000.svg?style=for-the-badge&logo=ollama&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

NeuroDoc AI is an enterprise-grade reference ecosystem for hybrid engineering designed to resolve business inefficiencies and automate code governance using local On-Premise Artificial Intelligence. The project prioritizes absolute data sovereignty, strict multi-tenant isolation, and strict cloud cost optimization through a decoupled architecture running on self-hosted hardware.

---

## Master Roadmap & Target Architecture

This repository centralizes the evolutionary roadmap of the ecosystem. The architecture strictly follows the **interchangeable parts principle**: the backend core and data layers are decoupled via pure interfaces, allowing seamless migration between AI models or persistence providers without modifying the domain core.

```text
neurodoc-ai/
├── .github/workflows/         <-- CI/CD: Public showcase pipeline (Automated testing gates)
├── .gitea/workflows/          <-- CI/CD: On-Premise GitOps engine (Hermetic local execution)
├── backend-core/              <-- The Single Source of Truth: Core Domain (Spring Boot 3)
│   ├── src/main/java/.../
│   │   ├── domain/            <-- Pure Framework-less Business Rules (Compliance axioms)
│   │   └── infrastructure/    <-- Ports & Adapters (Plugs for PostgreSQL, RAG, and interfaces)
├── ai-governance/             <-- Edge CI/CD Gateway: Low-overhead pipeline interceptor (Rust)
│   └── src/main.rs            <-- Blistering fast 'git diff' stream capture & data encoding
├── mcp-server-python/         <-- Sovereign Model Context Protocol (MCP) Hub & RAG Engine
│   └── src/main.py            <-- Local FastAPI server exposing standardized tools to external IDEs
├── frontend-control/          <-- Presentation Layer: Visual Dashboard (Agility Semaphores)
├── docs/                      <-- Engineering Knowledge Base (Indexed into ChromaDB Vector Store)
│   ├── 01-isolation-rules.md  <-- Core domain isolation metrics
│   └── 02-hexagonal-layers.md <-- Interface plugs and hardware technical specifications
└── infra/                     <-- Homelab Orchestration Hub
    └── docker-compose.yml     <-- Local network topology & cross-runtime persistence layers
```

---

## Homelab Infrastructure & Zero-Trust Stack

The bare-metal environment is engineered under enterprise standards to completely mitigate the financial drain of third-party cloud credits:

* **Bare-Metal OS & Orchestration:** Central host managed via Docker Compose. Hybrid persistence is achieved using ChromaDB (semantic RAG orchestration) coupled with PostgreSQL + pgvector (correlated relational data).
* **Private GitOps Hub (Gitea Engine):** Self-hosted Gitea service running locally as a mirror/alternative to cloud services. It coordinates internal repository trees and runs Gitea Actions pipelines natively, operating with full sovereignty inside the local area network.
* **Zero-Trust Network Governance:** Edge routing secured by a Cloudflare Tunnel (cloudflared). This routes incoming HTTPS traffic safely and exposes traditional web services (such as Gitea web interface and backend components) without opening residential ports or revealing the host's public IP address.
* **Standardized Context Sharing (Local MCP Hub):** Rather than isolating semantic knowledge within closed scripts, the Python subsystem exposes a native **Model Context Protocol (MCP)** server. This acts as a standardized data bridge, allowing external IDE extensions (e.g., Cursor, Cline, or localized development utilities) to query ChromaDB style guides and stream architecture axioms simultaneously, completely neutralizing cross-tool context blindness.
* **Hybrid Integration Pipeline:** A Gitea/GitHub Self-Hosted Runner agent integrated into the local node. It executes builds, linters, and architectural tests utilizing local compute resources to prevent third-party platform billing.
* **Dedicated Local Inference:** Hybrid AI processing using local infrastructure mapped alongside external high-efficiency APIs. The ecosystem evaluates token-per-second throughput and context window footprints on restricted local hardware constraints to benchmark precise scalability metrics, calculating cost-to-performance ratios before provisioning larger enterprise nodes.
---

## Targeted Core Use Cases & Solved Market Flaws

The ecosystem applies a *Forward Deployed Engineer* mindset by deploying highly specialized modules addressing three real-world sectors:

### 1. For Software Developers (Active Code Governance & Environmental Memory)
* **The Problem:** Exponential technical debt degradation across enterprise repositories due to unregulated code injection from generative AI tools. Short-lived commercial AI assistants function within static silos, treating every prompt as a blank slate. Lacking a persistent memory of the project environment, they introduce volatile 'Auto-Fix' code patches under tight delivery deadlines.
* **The NeuroDoc Solution:** Automated pre-flight interception where the compiled Rust `ai-governance` binary captures `git diff` deltas on every commit push. Instead of evaluating changes in isolation, the system anchors the delta stream against the project's global architectural context and long-term environmental guidelines indexed inside ChromaDB. It automatically blocks merges if compliance violations are detected, ensuring context always wins over raw execution speed.

### 2. For Bike Shops / Specialized Retailers (Inventory & Cash Flow Optimization)
* **The Problem:** Recurrent cash flow crunches triggered by passive procurement management. This leads to costly out-of-stock scenarios during high-demand peaks alongside stagnant capital tied up in low-turnover items.
* **The NeuroDoc Solution:** Predictive data analytics module. It ingests historical point-of-sale (POS) data through analytic pipelines, rendering demand forecasts that optimize Just-In-Time (JIT) stock restocking while protecting the business's working capital.

### 3. For Major Legal Consulting Firms (Data Sovereignty & Sealed RAG)
* **The Problem:** Inability to leverage large language models for internal contract audits due to severe compliance risks regarding public cloud data leaks, professional secrecy, and strict GDPR requirements.
* **The NeuroDoc Solution:** A secure enterprise On-Premise RAG platform. It implements metadata-driven multi-tenant isolation. Document ingestion of jurisprudence and LLM inference occur entirely within the boundaries of the physical On-Premise server, ensuring absolute client privacy.

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
 🌐 (Secure Tunnel)          🌐 (Secure Tunnel)          🌐 (Secure Tunnel)          🌐 (Secure Tunnel)
         │                           │                           │                           │
 [ Dev 1: Home Rig ]         [ Dev 2: Home Rig ]         [ Dev 3: Home Rig ]         [ Dev 4: Home Rig ]
 (vLLM • PagedAttention)     (vLLM • PagedAttention)     (vLLM • PagedAttention)     (vLLM • PagedAttention)
```

#### Technical Mechanics under Two-Tier Load Balancing:
1. **The Sovereign Home Node:** Employees register their home Homelab machines by spinning up a hermetic, lightweight NeuroDoc slave container that securely exposes their local CUDA runtime through automated, outbound **Cloudflare Tunnels** (avoiding open residential ports).
2. **Two-Tier Balanced Inference (Network + Hardware Cascade):**
   * **Level 1 (Network Load Balancing):** The Spring Boot core domain at the office treats these home nodes as abstract infrastructural adapters. When a commit push triggers an asset check, the central balancer routes the text delta to whichever employee's home machine has idle capacity.
   * **Level 2 (Local GPU Optimization via vLLM):** To prevent multiple simultaneous network requests from crashing a single developer's machine, each home container runs **vLLM** instead of standard single-user inference engines. By leveraging **PagedAttention**, the home node slices its VRAM (e.g., an RTX 3090's 24GB) into virtual memory pages, managing parallel user queries concurrently without triggering Out-Of-Memory (OOM) crashes.
3. **The "Proof-of-Inference" Payroll Incentive:** The platform monitors the exact number of tokens processed by each node. Instead of mining traditional volatile cryptocurrencies, workers "mine" internal corporate credits, translating into direct financial bonuses on their monthly payroll to subsidize hardware depreciation and domestic electricity costs.

This framework shifts corporate infrastructure scaling: This offers a decentralized, zero-cloud-cost compute alternative, while engineering teams monetize their hardware assets during the day.

---
* Have a radical optimization or want to propose **[IDEA-002]**? Open an Issue or submit a Pull Request to pitch your design framework.*

##  Roadmap Milestones & Horizon (In Development)

* [ ] **Phase 1: Core Infra Setup** – Unified Docker orchestration of **Gitea Platform**, ChromaDB, PostgreSQL (pgvector), and the Cloudflare Tunnel engine.
* [ ] **Phase 2: Git Interceptor Core** – Finalizing the native `ai-governance` Rust component for efficient `git diff` analysis.
* [ ] **Phase 3: Standardized MCP Layer** – Implementing the Python Model Context Protocol hub to stream unified compliance rules to third-party IDE nodes.
* [ ] **Phase 4: Architecture Metrics Dashboard** – Frontend UI to track core domain coupling and monitor linting compliance scores across repository branches.
* [ ] **Phase 5: Multi-Tenant Data Isolation** – Implementing Row-Level Security (RLS) in PostgreSQL and metadata namespaces in ChromaDB to guarantee strict tenant partition.
