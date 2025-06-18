# 🐱 Cat Facts - Testes Automatizados da API `/breeds`

Este projeto realiza testes automatizados para o endpoint `/breeds` da [Cat Facts API](https://catfact.ninja), utilizando **Java**, **JUnit**, **Cucumber** e **Rest-Assured**. Aqui validamos o comportamento da API em cenários válidos e inválidos.

---

## ✅ Tecnologias utilizadas

- Java 11+
- JUnit 4
- Cucumber 7
- Rest-Assured 5
- SLF4J + Logback (para logs)
- Maven
- IntelliJ IDEA (IDE recomendada)

---

## 🧪 Casos de Teste Implementados

### 📄 Feature: Breeds

#### CT01 - Obter a lista de raças de gatos com os parâmetros padrão

**Requisição:**  
`GET /breeds`

**Validações:**
- Status code 200 (OK)
- Lista de raças de gatos no corpo da resposta
- Inclusão de detalhes de paginação (`current_page`, `per_page`, `total`, etc)

---

#### CT02 - Enviar um valor não numérico para o parâmetro `page`

**Requisição:**  
`GET /breeds?page=test`

**Validações esperadas:**
- Status code 400 (Bad Request)

⚠️ *Atualmente a API pode retornar 200, mas o teste antecipa um comportamento ideal. Esse cenário serve como evidência de possível melhoria na API.*

---

## ▶️ Como executar os testes

### Usando IntelliJ:
1. Clique com o botão direito em `CatFactsTest.java`
2. Clique em **Run 'CatFactsTest'**

### Usando Maven:

```bash
mvn test


📂 Relatórios de Evidência

Após a execução dos testes, os relatórios são gerados automaticamente pelo Cucumber no seguinte diretório:

src/test/resources/evidences

✍️ Autor
Lucas Valentim
Engenheiro de Testes Automatizados