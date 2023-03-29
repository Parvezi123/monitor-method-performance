
# Spring Boot 3 observability to monitor Method Performance

Using Spring Boot 3 observability to monitor the method performance
Sometimes we face performance issues with some services or methods. Some methods perform slower or throw more errors than usual. But it is tough to isolate the actual method that is slow or causing issues when there is a chain of methods we call to perform a big task.

Here, I will use Spring Boot 3 observability feature with AOP to monitor a method. I am using AOP to reduce the coding and take advantage of annotations. Let’s begin 🙂



## Dependencies

- We need to add 2 dependencies in pom.xml file.


```` 
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency> 
````


    
## Demo

-  If we call the api: localhost:8080/welcome?name=Parvez we will get the logs

- I wanted to get some statistics so I will enable actuator endpoint, then add below lines in application.properties

-
    ````
    management.endpoints.web.exposure.include=*
    ````

- we will get some statistics by calling: localhost:8080/actuator/metrics/welcomeMethod


## 🚀 About Me
I'm a Software Developer Engineer in Siemens, Bengaluru...



## Authors

- [@Parvezi123](https://github.com/Parvezi123)
