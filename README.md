
![Logo](https://upload.wikimedia.org/wikipedia/commons/4/44/Spring_Framework_Logo_2018.svg)

# Spring POS

This is a Spring-based backend for a Point of Sale (POS) system, offering RESTful APIs for managing customers, items, orders, and transactions. The project leverages Spring Framework, JPA, Hibernate, Tomcat, and MySQL for efficient database connectivity and robust backend functionality.
## Features

- Customer Management (Create, Read, Update, Delete)
- Item Management (Create, Read, Update, Delete)
- Order and Transaction Processing
- Exception Handling and Validation using Hibernate Validator
- JSON Response formatting


## Technologies

- **Java Vesion:** JDK 21
- **Backend Framework:** Spring
- **Database:** MySQL
- **ORM:** JPA, Hibernate
- **Server:** Apache Tomcat 11.0.0-M26
- **Validation:** Hibernate Validator
- **Logger:** Logback


## Architecture Overview
- **Entities:** Representations for Customer, Item, Order, and OrderDetail
- **Data Transfer Objects (DTOs):** Includes CustomerDTO, ItemDTO, and OrderDTO
- **Repositories:** Interfaces for database operations, such as CustomerRepository, ItemRepository, OrderRepository, and OrderDetailRepository
- **Services:** Business logic for managing customers, items, and orders in CustomerService, ItemService, and OrderService
- **Controllers:** API endpoints for handling customer, item, and order-related requests via CustomerController, ItemController, and OrderController
- **Utilities:** Helper classes for tasks like object mapping (Mapping) and application utilities (AppUtil)
- **Exceptions:** Custom error handling mechanisms for specific scenarios
- **Configuration:** Application setup classes like WebAppConfig and WebAppRootConfig

## Validation
Data validation is enforced through Hibernate Validator annotations within the DTO classes, ensuring both data integrity and accuracy.

## Logging
Logging is set up with Logback, capturing logs both in the console and in a dedicated file.

## Custom Exceptions
Custom exceptions are designed to address specific error situations, delivering clear and informative error messages to the client.

## Setup and Configuration

**Prerequisites**

- **JDK 21**
- **Tomcat 11**
- **MySQL server**
- **Maven**


## Clone the repository:



```bash
  https://github.com/weerapperuma/SimplePos_Spring.git
```

## API Documentation

To view this project API Documentation

Refer to the [ Postman API Documentation](https://documenter.getpostman.com/view/37487843/2sAXxV7Vvv) for detailed API endpoints and usage instructions.


## License

This project is licensed under the MIT License - see the [ MIT License](https://github.com/weerapperuma/SimplePos_Spring/blob/e47f7b6b7b7422625b707786e6afb7f054087265/LICENSE) file for details.

##
<div align="center">

[![Tech Stack](https://skillicons.dev/icons?i=git,github,spring,hibernate,maven,mysql,postman)](https://skillicons.dev)
</div> <br>
<p align="center">
  &copy; 2024 Sahiru Weerapperuma
</p>
