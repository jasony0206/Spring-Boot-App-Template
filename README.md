# Spring Boot Application Template
This is a tutorial-like template of a Spring Boot Java web application. Various endpoints are available, with each utilizing a distinct feature that Spring Boot provides out of the box. In addition, Thymeleaf template engine is integrated to help visualize endpoints while maintaining the MVC architecture. 

### To run unit tests:
`mvn clean test`

### To run integration tests:
`mvn clean install`

### To run and access the application
`mvn spring-boot:run` and you can access the application at localhost:8080

### API documentation
Swagger UI is integrated within this project. Swagger UI is an automated API documentation tool. Once the application is up and running, you can access the documentation page of all API endpoints at `http://localhost:8080/swagger/index.html`

### Heroku Deployment
Procfile in the project root directory is added to support Heroku Deployment. Simply follow the steps below to see this application deployed on the web.

prerequisites: 
* Heroku toolbelt installed
* Heroku account & logged in

git clone <this repo>
cd spring-boot-app-template  
heroku create  
get push heroku master  
heroku open
