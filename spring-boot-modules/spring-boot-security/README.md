## Spring Boot Security

This module contains articles about Spring Boot Security

### Relevant Articles:

- [Spring Boot Security Auto-Configuration](https://www.nabgc.com/spring-boot-security-autoconfiguration)
- [Spring Security for Spring Boot Integration Tests](https://www.nabgc.com/spring-security-integration-tests)
- [Introduction to Spring Security Taglibs](https://www.nabgc.com/spring-security-taglibs)
- [Guide to @CurrentSecurityContext in Spring Security](https://www.nabgc.com/spring-currentsecuritycontext)
- [Disable Security for a Profile in Spring Boot](https://www.nabgc.com/spring-security-disable-profile)


### Spring Boot Security Auto-Configuration

- mvn clean install 
- uncomment actuator dependency simultaneously with the line from basic auth main class
- uncomment security properties for easy testing. If not random will be generated.

### CURL commands

- curl -X POST -u nabgc-admin:nabgc -d grant_type=client_credentials -d username=nabgc-admin -d password=nabgc http://localhost:8080/oauth/token
