# spring-boot-microservice-security
Spring boot microservices with spring security and jwt token for role based authorization.

To Run each microservices follow below step for each microservice.

## Project Setup

```
npm install
```

## Run Locally

```
mvn spring-boot:run
```

## Generate JWT token
```bash
URL : http://localhost:8581/auth
HTTP Method : POST
```
Json Request (admin) :
```json
{
	"username":"admin",
	"password":"12345"
}

```
Json Request (user) :
```json
{
	"username":"hk",
	"password":"12345"
}
```
Header Response :
```json
{
  "Authorization":"Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoayIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE1OTEzMzkyNTgsImV4cCI6MTU5MTQyNTY1OH0.Jt49E0MtEUtLoHD3lc2G44g1ZbPlPc1-dHJ-oYksXiI-Iy6mzDvu4ZYL1n1ryyd09c01lxIkHqyoBpeXIDW7RA"
}

```

## Contribute

Spring Boot Microservice Security is an open source project. So, feel free to contribute. And if you're new to contributing to Open Source on Github, then [this guide](https://guides.github.com/activities/contributing-to-open-source/) will help you.

If you find any error or have any suggestion, feel free to create an [issue](https://github.com/iamdhrv/spring-boot-microservice-security/issues/new).
