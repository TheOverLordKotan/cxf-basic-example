 Base Service

## The main function

-User orquestation

## Postman 
-- URL test
https://www.getpostman.com/collections/96f537adc695aaf6b865

## Service configuration

-`application.properties`

  ```properties
	spring.profiles.active=IntegracionesUserTest
	server.port=9090
	spring.datasource.url=jdbc:mysql://127.0.0.1:3306/demo_database?serverTimezone=UTC&useSSL=false
	spring.datasource.username= adarchitectureWS
	spring.datasource.password=123456
	safesforce.ws.user.url = http://127.0.0.1:9090/services/ServicioSalesForceInteUser?wsdl

  ```

## Environmental requirements

-mysql 5.6+
-JDK 8+

## Installation and startup steps

-Run `eureka-server`, [code base address](https://github.com/adarchitecture/eureka-server.git).

-Pull the current project to the local

  ```sh
  git clone https://github.com/TheOverLordKotan/cxf-basic-example.git
  ```

-Create a database, locally create the `cxf-basic` database and default user, the example is as follows:

  ```sql
  CREATE USER'adarchitectureWS'@'%' IDENTIFIED BY "123456";
  CREATE DATABASE IF NOT EXISTS demo_database DEFAULT CHARACTER SET utf8;
	USE `demo_database`;
	DROP TABLE IF EXISTS `employee`;
	CREATE TABLE `employee` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name` varchar(100) NOT NULL,
	`lastname` varchar(255) NOT NULL,
	`tpDocument` varchar(255) NOT NULL,
	`nbDocument` varchar(255) NOT NULL,
	`fchBorn` varchar(20) NOT NULL,
	`fchIn` varchar(20) NOT NULL,
	`role` varchar(20) NOT NULL,
	`salary` varchar(255) NOT NULL
	);
	GRANT ALL PRIVILEGES ON demo_database.* TO adarchitectureWS@'%';
	FLUSH PRIVILEGES;
		GRANT ALL PRIVILEGES ON *.* TO 'adarchitectureWS'@'172.20.0.3'
		IDENTIFIED BY '123456' 
		WITH GRANT OPTION;
	FLUSH PRIVILEGES;
  ```


-Start the project, execute the following commands in the project root directory:
  ```sh
    mvn spring-boot:run 
	or 
	mvn clean:install
	cd target
	java -jar app.jar
  ```
  
## Update log

-[Update Log](./CHANGELOG.md)



## How to participate

Welcome to participate in our project to learn more about how to [participate in contribution](https://github.com/adarchitecture/).