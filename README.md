# Spring Embedded Database #
The following was implemented as part of building this project:

* Create a springboot project
* Develop & publish restful web services
* Use embedded database to create and manage data source

## Technologies Used ##

* Maven 3.0
* Springboot-2.2.4 
* Spring 5.3.5
* Hibernate 5.4.29.Final
* Spring Data JPA 2.4.6
* H2 1.4.200

## Getting started with H2 Database ##

* Add H2 database dependency

	<dependency>
		<groupId>com.h2database</groupId>
		<artifactId>h2</artifactId>
		<scope>runtime</scope>
	</dependency>
	
* Data source configuration in application properties

	spring.datasource.url=jdbc:h2:file:./data/testdb
	spring.datasource.driverClassName=org.h2.Driver
	spring.datasource.username=sa
	spring.datasource.password=
	spring.datasource.initialization-mode=always
	spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

* To enable H2 console: 
	
	spring.h2.console.enabled=true
	
* Should be able to access the H2 console for database operation: http://localhost:9321/h2
* if customized console url defined in spring.h2.console.path=/myh2db ,then need to access http://localhost:9321/myh2db
* Further H2 configurations to trace log and settings

	spring.h2.console.settings.trace=true # by default it's false
	spring.h2.console.settings.web-allow-others=true # by default it's false

* Default database schema and data files
	
	The default schema for the application can be added at src/main/resources/schema.sql
	spring loads and executes schema.sql by default if there's no explicit hibernate configuration spring.jpa.hibernate.ddl-auto=create, create-drop, update, validate
	Similarly, src/main/resources/data.sql can be added to pre-load master tables

### To run and setup this project locally

	$ git clone <>
	$ mvn clean install
	$ java -jar target/spring-mvc-embedded-database.jar
	
Access the server using http://localhost:9321/service	

### Import this project into Eclipse IDE

	1. Import into eclipse using existing maven project into workspace
	2. Right click -> Maven Install
	3. Start SpringWebServiceApplication

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)