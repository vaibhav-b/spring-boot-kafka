package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Source - https://www.confluent.io/blog/apache-kafka-spring-boot-application/
 * https://github.com/igorkosandyak/spring-boot-kafka
 * https://github.com/vaibhav-b/spring-boot-kafka
 * In order to test the application, follow below steps.
 *
 *
 * 1) Start Zookeeper
 *
 * cmd>cd C:\kafka_2.12-3.1.0
 * cmd> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
 *
 *
 * 2) Start Kafka setup
 *
 * cmd> cd C:\kafka_2.12-3.1.0
 * cmd> .\bin\windows\kafka-server-start.bat .\config\server.properties
 *
 * 3) Create a Topic(optional)
 *
 * cmd>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic myKafkaTest
 *
 * 4) Run Spring Boot Application
 *
 * 5) After starting application test api.
 * curl -X POST -F "message=test" http://localhost:9000/kafka/publish
 */
@SpringBootApplication
public class SpringBootWithKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithKafkaApplication.class, args);
	}
}
