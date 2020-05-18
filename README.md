# Features

* Written fully in Spring
* Desgined for multi-region and Kubernetes-native deployments
* Features 2 microservices
* Uses a discovery service that the microservices register with


| Microservice         | H2 API | Default host:port | Description           |
| -------------------- | ---------------- | ---------------- | --------------------- |
| [service discovery](https://github.com/talhapatel/spring-microservice-demo/tree/master/service-registry) | - | [localhost:8761](http://localhost:8761) | Uses **Eureka** for localhost. All microservices register with the Eureka service. This registration information is used to discover dynamic properties of any microservice. Examples of discovery include finding the hostnames or ip addresses, the load balancer and the port on which the microservice is currently running.
| [api-gateway](https://github.com/talhapatel/spring-microservice-demo/tree/master/cloud-gateway) | - | [localhost:8081](http://localhost:8081) | This microservice handles all the external API requests. The UI only communicates with this microservice.
| [payment-service](https://github.com/talhapatel/spring-microservice-demo/tree/master/payment-service) | H2 | [localhost:8082](http://localhost:8082) | This microservice contains the entire product catalog. It can list products by categories, return the most popular products as measured by sales rank, etc.
| [order-service](https://github.com/talhapatel/spring-microservice-demo/tree/master/order-service) | H2 | [localhost:8083](http://localhost:8083) |.
 *Note that this is still a work in progress.*