# ▪️ NeuroDoc AI • Next-Gen Hybrid Infrastructure & AI Governance
> **The Project-Based Engineering Roadmap: Architecture, Homelab GitOps & Automated Pipeline Audit**

![Debian](https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white)
![Gitea](https://img.shields.io/badge/Gitea-34495E?style=for-the-badge&logo=gitea&logoColor=5D9425)
![GitHub Actions](https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Cloudflare](https://img.shields.io/badge/Cloudflare-F38020?style=for-the-badge&logo=Cloudflare&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![NodeJS](https://img.shields.io/badge/node.js-6DA55F.svg?style=for-the-badge&logo=node.js&logoColor=white)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![FastAPI](https://img.shields.io/badge/FastAPI-005571.svg?style=for-the-badge&logo=fastapi)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Ollama](https://img.shields.io/badge/ollama-%23000000.svg?style=for-the-badge&logo=ollama&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

NeuroDoc AI is an enterprise-grade reference ecosystem for hybrid engineering designed to resolve business inefficiencies and automate code governance using local On-Premise Artificial Intelligence. The project prioritizes absolute data sovereignty, strict multi-tenant isolation, and radical cloud cost optimization through a decoupled architecture running on self-hosted hardware.

---

## 🗺️ Master Roadmap & Target Architecture

This repository centralizes the evolutionary roadmap of the ecosystem. The architecture strictly follows the **interchangeable parts principle**: the backend core and data layers are decoupled via pure interfaces, allowing seamless migration between AI models or persistence providers without modifying the domain core.

```text
neurodoc-ai/
├── .github/workflows/         <-- CI/CD: Automated pre-flight quality gates (Public Showcase)
├── .gitea/workflows/          <-- CI/CD: On-Premise GitOps engine (Hermetic Sovereignty)
├── backend-core/              <-- Decoupled Business Engines (Spring Boot / Node.js)
│   ├── src/main/java/.../
│   │   ├── domain/            <-- Pure Domain Core (Framework-less Business Rules)
│   │   └── infrastructure/    <-- Ports & Adapters (Interchangeable Persistence & Interfaces)
├── ai-governance/             <-- The Active Guardian (FDE Pipeline Interceptor)
│   └── ai-validator.js        <-- Real-time semantic commit delta analysis
├── frontend-control/          <-- Visual Dashboard featuring Agility Semaphores & Metrics
├── docs/                      <-- Engineering Knowledge Base (Indexed into Vector DB)
│   ├── 01-isolation-rules.md  <-- Core domain isolation axioms
│   └── 02-hexagonal-layers.md <-- Interface plugs and technical specifications
└── infra/                     <-- Homelab Orchestration Hub
    └── docker-compose.yml     <-- Local network topology & advanced persistence layers
```

---

## ⚙️ Homelab Infrastructure & Zero-Trust Stack

The bare-metal environment is engineered under enterprise standards to completely mitigate the financial drain of third-party cloud credits:

* **Bare-Metal OS & Orchestration:** Central host managed via Docker Compose. Hybrid persistence is achieved using ChromaDB (semantic RAG orchestration) coupled with PostgreSQL + pgvector (correlated relational data).
* **Private GitOps Hub (Gitea Engine):** Self-hosted Gitea service running locally as a mirror/alternative to cloud services. It coordinates internal repository trees and runs Gitea Actions pipelines natively, operating with full sovereignty inside the local area network.
* **Zero-Trust Network Governance:** Edge routing secured by a Cloudflare Tunnel (cloudflared). This routes incoming HTTPS traffic safely and exposes traditional web services (such as Gitea web interface and backend components) without opening residential ports or revealing the host's public IP address.
* **Hybrid Integration Pipeline:** A Gitea/GitHub Self-Hosted Runner agent integrated into the local node. It executes builds, linters, and architectural tests utilizing local compute resources to prevent third-party platform billing.
* **Dedicated Local Inference:** Hybrid AI processing using local infrastructure mapped alongside external high-efficiency APIs. The ecosystem evaluates token-per-second throughput and context window footprints on restricted local hardware constraints to benchmark precise scalability metrics, calculating cost-to-performance ratios before provisioning larger enterprise nodes.
---

## 🏢 Targeted Core Use Cases & Solved Market Flaws

The ecosystem applies a *Forward Deployed Engineer* mindset by deploying highly specialized modules addressing three real-world sectors:

### 1. For Software Developers (Active Code Governance)
* **The Problem:** Exponential technical debt degradation and architectural decay across enterprise repositories due to unregulated code injection from generative AI tools. Passive documentation silos (.md files or wikis) fail under strict delivery deadlines because they rely on manual developer compliance.
* **The NeuroDoc Solution:** Automated pre-flight interception during the Continuous Integration cycle. **Developers simply drop their architectural rules and style guides as Markdown files; the pipeline autonomously monitors the repository on their behalf.** The validator (`ai-validator.js`) extracts git diff deltas on every push, queries ChromaDB for contextual style alignment, and commands the local LLM to automatically block the merge if design violations are found.

### 2. For Bike Shops / Specialized Retailers (Inventory & Cash Flow Optimization)
* **The Problem:** Recurrent cash flow crunches triggered by passive procurement management. This leads to costly out-of-stock scenarios during high-demand peaks alongside stagnant capital tied up in low-turnover items.
* **The NeuroDoc Solution:** Predictive data analytics module. It ingests historical point-of-sale (POS) data through analytic pipelines, rendering demand forecasts that optimize Just-In-Time (JIT) stock restocking while protecting the business's working capital.

### 3. For Major Legal Consulting Firms (Data Sovereignty & Sealed RAG)
* **The Problem:** Inability to leverage large language models for internal contract audits due to severe compliance risks regarding public cloud data leaks, professional secrecy, and strict GDPR requirements.
* **The NeuroDoc Solution:** A hermetically sealed enterprise RAG platform. It implements metadata-driven multi-tenant isolation. Document ingestion of jurisprudence and LLM inference occur entirely within the boundaries of the physical On-Premise server, ensuring absolute client privacy.

---

## 🔔 Stay Tuned & Follow Development

The ecosystem is built openly in a **Building in Public** fashion. To monitor real-time architectural changes, system updates, and roadmap iterations:
* Click the **Watch** button at the top right of this repository.
* Select **Custom -> Commits** to subscribe directly to the engineering file history and track the system's live evolution.

---

## ⚖️ Disclaimer & Legal Liability

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

---

## 📈 Roadmap Milestones & Horizon (In Development)

* [ ] **Phase 1: Core Infra Setup** – Unified Docker orchestration of **Gitea Platform**, ChromaDB, PostgreSQL (pgvector), and the Cloudflare Tunnel engine.
* [ ] **Phase 2: Git Interceptor Core** – Completion of the `ai-validator.js` Node.js script for molecular delta extraction via `git diff`.
* [ ] **Phase 3: Visual Agility Semaphore** – Frontend dashboard monitoring what percentage of the domain layer remains uncontaminated by external dependencies.
* [ ] **Phase 4: Multi-tenant Metadata Isolation** – Strict database row-level locking and vector namespace isolation to guarantee total regulatory compliance.
