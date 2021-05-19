# MyJava
not labs

## Task 
   + Create REST service and implement CRUD(GET/POST/PUT/DELETE) operations on object from 8-th lab
   + GET operation with id provided should return object with requested id, 
   + Get operation without id provided should return list of all objects
   + Code should be checked with checkstyle and pmd plugins
   + Code should be in a different pull request than lab8
   + Controller and RestApplication should be in a different packages

 ## How to run
   + Clone this repository with command `git clone https://github.com/max-dmytryshyn/Java-Labs.git`
   + `cd` into folder where you stored thus repository
   + Choose branch Lab_9 with command `git checkout lab9`
   + Run `mvn install` (you have to install maven on your system, if you haven't done so before; also you have to choose 11 version of Java)
   + Run `java -jar target/lab9-VERSION.jar`, where `VERSION` is version of the app (can be found in `pom.xml`, under `<version>` tag)
   + Open http://localhost:8080/plasterers in your browser