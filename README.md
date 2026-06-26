# 🏛️ Sistema Parlamentar — Deputada Federal Antônia Lúcia (Acre)

Sistema interno de gestão parlamentar desenvolvido para o gabinete da Deputada Federal Antônia Lúcia (Acre, legislatura 2023–2027).

---

## 📋 Sobre o Projeto

Ferramenta de apoio estratégico para a gestão parlamentar, reunindo dados eleitorais, socioeconômicos, religiosos e de emendas parlamentares dos 22 municípios do Acre em uma única interface.

---

## ✨ Funcionalidades

### 🗳️ Votos
- Resultado das eleições 2024 por município (dados TSE)
- Ranking visual de votos com barras por região
- Tabela ordenável com votos, IDH, eleitores 2024 e população
- Filtro por região (Vale do Acre, Vale do Juruá, Vale do Purus)

### 💰 Emendas Parlamentares
- 268 emendas cadastradas (~R$ 223 milhões)
- CRUD completo (criar, editar, excluir)
- Filtro por município e status (Indicada, Aprovada, Paga, Cancelada)
- Gráfico de emendas por órgão

### ⛪ Religião
- Dados do Censo IBGE 2022 para todos os 22 municípios
- Gráfico de pizza interativo por município
- Barras empilhadas comparando todos os municípios
- Tabela completa com 8 grupos religiosos (Evangélica, Católica, Espírita, Umbanda, Tradições Indígenas, Outras, Sem Religião, Sem Declaração)

### 🔐 Autenticação
- Login com JWT (JSON Web Token)
- Spring Security com controle de perfis (ADMIN, EDITOR)
- Suporte para até 10 usuários do gabinete

---

## 🛠️ Stack Tecnológica

### Backend
- **Java 21** + **Spring Boot**
- **Spring Security** + **JWT**
- **Spring Data JPA** + **Hibernate**
- **PostgreSQL** (porta 5433)

### Frontend
- **React** (Create React App)
- Gráficos em **SVG puro** (sem bibliotecas externas)
- Estilização inline com tema escuro

---

## 📊 Dados Utilizados

| Fonte | Dados |
|-------|-------|
| TSE 2024 | Votos por município (nome de urna: ANTÔNIA LUCIA) |
| TSE 2024 | Perfil do eleitorado por município (612.448 eleitores no Acre) |
| IBGE Censo 2022 | Dados religiosos por município |
| IBGE | População e IDH por município |

---

## 🚀 Como Rodar Localmente

### Pré-requisitos
- Java 21
- Node.js 18+
- PostgreSQL rodando na porta 5433

### Backend
```bash
cd api
./mvnw spring-boot:run
```
O servidor sobe em `http://localhost:8080`

### Frontend
```bash
cd frontend
npm install
npm start
```
O sistema abre em `http://localhost:3000`

### Banco de Dados
```
Host: localhost
Porta: 5433
Banco: antonialucia
Usuário: guilhermevieira
```

### Primeiro acesso
```
Email: admin@antonia.leg.br
Senha: admin123
```

---

## 📁 Estrutura do Projeto

```
antonia-lucia/
├── api/                          # Backend Spring Boot
│   └── src/main/java/br/leg/antonia/api/
│       ├── model/                # Entidades JPA
│       ├── repository/           # Repositórios Spring Data
│       ├── service/              # Regras de negócio
│       ├── controller/           # Endpoints REST
│       └── security/             # JWT + Spring Security
└── frontend/                     # React App
    └── src/
        └── App.js                # Aplicação completa
```

---

## 📸 Screenshots

> Sistema com tema escuro, dados reais dos 22 municípios do Acre.

**Aba Votos** — ranking de votos por município com filtro por região  
**Aba Emendas** — gestão completa das emendas parlamentares  
**Aba Religião** — gráficos interativos de composição religiosa

---

## 👨‍💻 Desenvolvido por

**Guilherme Vieira**  
Projeto desenvolvido como sistema interno do gabinete parlamentar e portfólio de desenvolvimento full stack.

---

*Dados eleitorais e populacionais com base em fontes oficiais (TSE e IBGE).*
