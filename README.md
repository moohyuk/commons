# Ryan Common Modules
> Spring Boot + SpringData JPA
### - application.yml
```yml
# SET TOMCAT
server:
  port: 8070
  tomcat:
    accesslog:
      enabled: true
      directory: /ryan-commons/access-log
      pattern: "%t %s \"%r\" %b (%Dms)"

logging:
  file: ryan-commons.log


# SET JPA DATASOURCE
spring:
  application:
    name: CommonsApplication
  jpa:
    hibernate:
      ddl-auto: none
    generate-ddl: false
    show-sql: true
    properties: 
      hibernate.format_sql: true
      
  datasource:
    driver-class-name: org.h2.Driver
    url: jdbc:h2:~/ryan_commons;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
    username: sa
    password:
    tomcat:
      validation-query: select 1
```

## Mail Configuration
### - application.yml
```yml
mail:
  host: smtp.gmail.com
  port: 587
  protocol: smtp
  default-encoding: UTF-8
  username: your-email@domain
  password: password
  smtp:
    start-tls-enable: true
    auth: true
```
