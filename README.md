# RESTful API em Java 17 com Spring Boot 3xx
Esta é uma API RESTful desenvolvida em Java 17 usando Spring Boot 3xx. A API utiliza Spring Data JPA para simplificar a camada de acesso aos dados, OpenAPI (Swagger) para documentação e Railway para deploy na nuvem.

# Try out
https://api-to-do-list-api-web.up.railway.app/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

# Tecnologias Utilizadas
- Java 17: Linguagem de programação.
- Spring Boot 3: Framework para criar aplicações Java standalone.
- Spring Data JPA: Simplifica a camada de acesso aos dados, facilitando a integração com bancos de dados SQL.
- OpenAPI (Swagger): Para documentação fácil e interativa.
- Railway: Facilita o deploy na nuvem, além de oferecer diversos bancos de dados.

```mermaid
classDiagram
    class Todo {
        +id: Long
        +title: String
        +description: String
        +status: String
    }

    class TodoController {
        +createTodo()
        +getTodos()
        +updateTodo()
        +deleteTodo()
    }

    class TodoService {
        +createTodo()
        +getTodos()
        +updateTodo()
        +deleteTodo()
    }

    class TodoRepository {
        <<interface>>
        +save()
        +findAll()
        +findById()
        +deleteById()
    }

    TodoController --> TodoService : uses
    TodoService --> TodoRepository : uses
    TodoRepository --> Todo : manages

