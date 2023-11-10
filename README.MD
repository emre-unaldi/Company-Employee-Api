# `Company Employee Api`
This backend project was bootstrapped with [Java Spring Boot](https://spring.io)
> This Web API project was developed to complete a task.

> This project was implemented with `n-Layered Architecture`, complying with `SOLID` and `Clean Code` principles.

> Auditing Structure was used in the project.

## `Used Technologies`
- JDK 20
- Java 17
- Spring Framework
- Spring Core
- Spring Web
- Spring Data
- Spring Rest
- Spring Boot Dev Tools
- PostreSQL
- Lombok
- Model Mapper
- Swagger

## `Run Application`
> After running the project, the application will run at [http://localhost:8000](http://localhost:8000)
- Swagger : http://localhost:8000/swagger-ui/index.html
- Auditing Structure was used in the project.
- Check the actual record in the database along with Swagger or Postman outputs !!!

## `Employee Endpoints`
| Route                        | HTTP     | POST body	                                                                                                             | Description            |
|------------------------------|----------|------------------------------------------------------------------------------------------------------------------------|------------------------|
| /api/v1/employee/add         | `POST`   | {"name": "string","surname": "string","email": "string","phone": "string","department": "string","companyId": 0}       | Create a new employee. |
| /api/v1/employee/update      | `PUT`    | {id: 0,"name": "string","surname": "string","email": "string","phone": "string","department": "string","companyId": 0} | Update a employee.     |
| /api/v1/employee/delete/{id} | `DELETE` | Empty                                                                                                                  | Delete a employee.     |
| /api/v1/employee/getAll      | `GET`    | Empty                                                                                                                  | List employees.        |
---
## `Company Endpoints`
| Route                       | HTTP     | POST body	                                                        | Description	          |
|-----------------------------|----------|-------------------------------------------------------------------|-----------------------|
| /api/v1/company/add         | `POST`   | {"companyName": "string","taxNumber": 0,"sector": "string"}       | Create a new company. |
| /api/v1/company/update      | `PUT`    | {id: 0,"companyName": "string","taxNumber": 0,"sector": "string"} | Update a company.     |
| /api/v1/company/delete/{id} | `DELETE` | Empty                                                             | Delete a company.     |
| /api/v1/company/getAll      | `GET`    | Empty                                                             | List companies.       |