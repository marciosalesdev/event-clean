# 🚀 Event & Venue Management API

Uma API moderna, escalável e robusta para gerenciamento de **eventos e locais (venues)**.
Desenvolvida com foco em **boas práticas, alta performance e fácil manutenção**, pronta para integração com sistemas reais.

---

## 📌 Visão Geral

Este projeto implementa uma API REST completa para gerenciamento de eventos e locais, utilizando **Java moderno** e princípios de **Clean Architecture**.

✔ Código limpo e organizado
✔ Fácil de escalar
✔ Pronto para produção
✔ Totalmente containerizado

---

## ✨ Funcionalidades

### 🎉 Event Management

* Criar eventos
* Atualizar eventos
* Listar eventos
* Remover eventos

### 🏢 Venue Management

* Cadastro de locais
* Controle de disponibilidade
* Gerenciamento de reservas

---

## 🧠 Arquitetura

O projeto segue os princípios da **Clean Architecture**, garantindo:

* 🔹 Separação de responsabilidades (camadas bem definidas)
* 🔹 Alta testabilidade
* 🔹 Baixo acoplamento
* 🔹 Facilidade de evolução

### 📂 Camadas da aplicação

* **Domain** → Regras de negócio
* **Application** → Casos de uso
* **Infrastructure** → Banco de dados, APIs externas
* **Presentation** → Controllers REST

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia     | Descrição                     |
| -------------- | ----------------------------- |
| ☕ Java 21      | Linguagem principal           |
| 🌱 Spring Boot | Framework backend             |
| 🗄️ PostgreSQL | Banco de dados                |
| 🐳 Docker      | Containerização               |
| 🛫 Flyway      | Versionamento de banco        |
| 📦 Maven       | Gerenciamento de dependências |

---

## 📁 Estrutura do Projeto

```bash
src
├── main
│   ├── java
│   │   └── com.example.eventmanagement
│   │       ├── application      # Casos de uso
│   │       ├── domain           # Regras de negócio
│   │       ├── infrastructure   # Banco e integrações
│   │       └── presentation     # Controllers REST
│   └── resources
│       ├── db/migration        # Scripts Flyway
│       └── application.yml     # Configurações
└── test
    └── java                    # Testes unitários e integração
```

---

## ⚙️ Como Executar o Projeto

### 🔧 Pré-requisitos

* Java 21
* Docker
* Maven (opcional)

---

### 📥 Clone o repositório

```bash
git clone https://github.com/seu-usuario/event-management-api.git
cd event-management-api
```

---

### 🐳 Rodando com Docker

```bash
docker-compose up
```

---

## 🔗 Endpoints da API

### 🎉 Eventos

| Método | Endpoint | Descrição      |
| ------ | -------- | -------------- |
| GET    | /events  | Listar eventos |
| POST   | /events  | Criar evento   |
|        |          |                |

---

### 🏢 Locais (Venues)

| Método | Endpoint | Descrição     |
| ------ | -------- | ------------- |
| GET    | /venues  | Listar locais |
| POST   | /venues  | Criar local   |
|        |          |               |

---

## 🗄️ Migrations (Flyway)

Os scripts ficam em:

```
src/main/resources/db/migration
```

Para rodar manualmente:

```bash
mvn flyway:migrate
```

---

## 🤝 Contribuição

Contribuições são muito bem-vindas! 🚀

### Passos:

```bash
# Fork
# Crie uma branch
git checkout -b feature/minha-feature

# Commit
git commit -m "Minha nova feature"

# Push
git push origin feature/minha-feature
```

Abra um Pull Request 👍

---

## 📄 Licença

Este projeto está sob a licença MIT.

---

## 👨‍💻 Autor

Desenvolvido com dedicação por **Seu Nome** 🚀
Sinta-se à vontade para contribuir ou entrar em contato!

---
