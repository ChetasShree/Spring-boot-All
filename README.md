### PART 1
[crt+alt+o = remove unwanted unused imports]
 ## Run in two ways:
- direct
- maven (./mvnw spring-boot:run)
  [ fn+alt+insert(delete wala) = getter setter and all ]
https://start.springboot.io/
JSON data
 -  {
     "departmentName":"IT",
     "departmentAddress":"Banglore",
     "departmentCode":"IT-06"
 }
 {
     "departmentName":"CE",
     "departmentAddress":"Banglore",
    "departmentCode":"CE-07"
 }
{
    "departmentName":"EEE",
    "departmentAddress":"Ahmedabad",
    "departmentCode":"EEE-01"
}
for other queries - https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
## Dependencies
- web (Spring Web)
- h2 (H2 Database)
- devtool(Spring Boot DevTools) [to autorun the project] { settings - build execute - build projectautomatic checkbox tick}
- JPA (Spring Data JPA)
- validation (Validation)
- -Lombok  (Lombok)(plugin also change/add) [to remove massive lines of getter setter toString ...]
- mysql (MySQL Driver )
- testing (Spring REST Docs )
Spring Boot 
- h2 console
- MYSQL DB
 -> API Creations 
  -PUT
  -PUSH
  -GET
  -DELETE
- Made different proflies for dev,qa,prod
- Made differnt checkpoints and also customized onces as well ,
- 13 endpoints and 2 deafult onces and some excluded ones also
- http://localhost:8082/h2-console
- http://localhost:8082/actuator
- http://localhost:8082/deparments 
