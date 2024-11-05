# Learning Apache Kafka
#### **Disclaimer:** this project is for myself learning how to use Kafka with Docker and SpringBoot with basic setup only. The notes about Kafka within this README file may not be correct due to I am still learning xD
Original tutorial was from [Daily Code Buffer](https://www.youtube.com/watch?v=tU_37niRh4U&ab_channel=DailyCodeBuffer) youtube channel

Bellow link is Kafka instruction for beginner but not with Docker. [Original Kafka manual](https://kafka.apache.org/quickstart)

If using Docker, it depends on which Kafka image provider that's in used to look for the proper instruction document.


## Kafka architecture  
Kafka Eco system:  
&nbsp;&nbsp;Kafka Clusters: perform the requests from senders and receivers (get data, send data)  
&nbsp;&nbsp;&nbsp;&nbsp;Broker 1  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Topic 1  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Partition 1 (and Offset setting)  
		
&nbsp;&nbsp;Zookeeper: manage Kafka Clusters and META data of senders and receivers  

*Notes:*
- Senders/Publishers/Producers: sending data to Kafka
- Receivers/Listeners/Consumers: receive data from Kafka
- Offset: control how Receiver will receive the data from a topic (from beginning, most recent, etc.)
- Group-id: define how messages shared among consumers/receivers

## Bootstrap Kafka server with Docker
> docker-compose up

The above command can be executed when inside cab-driver folder to run docker-compose.yaml file in the project and it will help to setup Kafka server + Zookeeper (confluent version)

## Run cab-driver application
Run it using intelliJ within the CabDriverApplication.java file

## Run cab-user application
Run it using intelliJ within the CabUserApplication.java file

![trigger sender](./public/trigger-sender.png)

Mock messages sent from Cab-Driver app are received by Cab-User after hit Send in Postman
![messages sent from cab-driver are received](./public/received-messages-sent-from-cab-driver.png)


## Generic commands from Apache Kafka instruction **(not directly applicable in this project due to using Confluent Kafka image):**

To Create a **Topic**
> bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

To check **Topics** info
> bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092

To jump to Kafka sender to send some messages
> bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

To jump to Kafka receiver to see messages sent from sender
> bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

