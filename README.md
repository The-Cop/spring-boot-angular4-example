# Spring Boot + Angular 4 Example

Based on [this aricle](https://blog.jdriven.com/2016/12/angular2-spring-boot-getting-started/) 

An example-template project which uses:

- Spring Boot for backend
- Apache Cxf JAX-RS with autoconfiguration and package scanning
- Angular 4 frontend

## Run options
#### First option - include frontent into backend
1. clean install frontend
2. Run BootAngularApplication.main() (or mvn spring-boot:run)

Frontend will be included as resources in backend jar.

#### Second option - run frontend and backend separately
1. npm start on frontend\src\main\frontend\package.json - starts frontend on 4200 port
2. Backend - Run BootAngularApplication.main() (or mvn spring-boot:run)

Frondend will be served and reloaded as you make changes, and you can restart backend and frontend independently. 

