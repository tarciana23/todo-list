# API para Gerenciar Tarefas

API para gerenciar tarefas (CRUD).


## 🛠 Tecnologias

- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- SpringDoc OpenAPI 3  
- MySQL  

---

## ✅ Práticas Adotadas

- Princípios SOLID  
- DRY, YAGNI, KISS  
- API RESTful  
- Consultas com Spring Data JPA  
- Injeção de Dependências  
- Tratamento de respostas de erro  
- Geração automática do Swagger com a OpenAPI 3  

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone <URL-do-repositório>
   ```

2. Construa o projeto:

   ```bash
   ./mvnw clean package
   ```

3. Execute a aplicação:

   ```bash
   java -jar target/todolist-0.0.1-SNAPSHOT.jar
   ```

4. A API estará disponível em:
   `http://localhost:8080`

5. Acesse a documentação Swagger:
   `http://localhost:8080/swagger-ui.html`

---

## 📮 API Endpoints

As requisições abaixo utilizam a ferramenta [httpie](https://httpie.io/):

### 🔸 Criar Tarefa

```bash
http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1
```

**Resposta:**

```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

---

### 🔹 Listar Tarefas

```bash
http GET :8080/todos
```

**Resposta:**

```json
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

---

### ✏️ Atualizar Tarefa

```bash
http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2
```

**Resposta:**

```json
[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

---

### 🗑 Remover Tarefa

```bash
http DELETE :8080/todos/1
```

**Resposta:**

```json
[ ]
```