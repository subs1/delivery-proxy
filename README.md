Build : Copy the application.properties file from src/main/resources to project root directory and issue maven install command
cp src/main/resourcs/application.properties . 
mvn clean install

Start : java -jar target\spring-ms-template-1.0.0.jar

Notes : Make sure application.properties file is available on the same folder as the jar

Docuementation : http://localhost:8081/swagger-ui.html, http://localhost:8081/v2/api-docs

To check other instances via eureka : http://localhost:8081/service-info

Deploy to 10.124.4.50:8081  
AAnnoojj
"# delivery-proxy" 
