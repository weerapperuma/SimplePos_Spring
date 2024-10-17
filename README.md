![Logo](https://upload.wikimedia.org/wikipedia/commons/4/44/Spring_Framework_Logo_2018.svg)

# Spring POS System

This project is a backend application for a Point of Sale (POS) system, developed using the Spring framework. It provides RESTful APIs for managing core functionalities like customers, items, orders, and transactional data. Leveraging Spring, JPA, Hibernate, Tomcat, and MySQL, the system ensures smooth backend operations and robust database management.

## Key Features

- CRUD Operations for Customer Management
- CRUD Operations for Item Management
- Order Processing and Transaction Management
- Integrated Validation via Hibernate Validator
- JSON Responses for clear data exchange

## Technology Stack

- **Java Version:** JDK 21
- **Backend Framework:** Spring Framework
- **Database Management:** MySQL
- **ORM:** JPA & Hibernate
- **Application Server:** Apache Tomcat 11.0.0-M26
- **Data Validation:** Hibernate Validator
- **Logging:** Logback

## System Architecture

- **Entity Models:** Defines entities like Customer, Item, Order, and OrderDetail
- **DTOs (Data Transfer Objects):** Includes representations such as CustomerDTO, ItemDTO, and OrderDTO
- **Repositories:** Interfaces for database access (e.g., CustomerRepository, ItemRepository)
- **Service Layer:** Handles core business logic in CustomerService, ItemService, and OrderService
- **Controllers:** Define API routes and handle customer, item, and order requests
- **Utilities:** Support tasks like object mapping (Mapping class) and general utilities (AppUtil)
- **Exception Handling:** Custom exceptions for precise error management
- **Configuration Files:** For setup, including WebAppConfig and WebAppRootConfig

## Data Validation

Input data is rigorously validated using annotations from Hibernate Validator within DTO classes, ensuring correctness and integrity.

## Logging Mechanism

The application employs Logback for effective logging, tracking activities in both the console and log files.

## Exception Management

Custom exceptions are set up to address specific issues, ensuring informative feedback is provided to users in case of errors.

## Installation & Setup

**Prerequisites:**

- **JDK 21**
- **Apache Tomcat 11**
- **MySQL**
- **Maven**

### How to Clone the Project:

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
