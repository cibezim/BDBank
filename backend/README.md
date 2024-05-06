# BDBank Application

Welcome to the BDBank backend application! This is a modern banking application that provides a wide range of banking services for customers and administrators. The application uses Spring Boot to deliver an efficient and reliable backend.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Overview

The BDBank backend application is designed to handle various banking operations such as account management, ACH payments, and transactions. Administrators can manage customers and monitor banking activities, while customers can access their accounts and perform other banking tasks.

## Features

- **Account Management**: Customers can create and manage their bank accounts.
- **ACH Payments**: Facilitates Automated Clearing House (ACH) payments for customers and administrators.
- **Transaction History**: Provides customers with access to their transaction history.
- **Security and Authentication**: Uses Spring Security to secure the application and ensure safe access to services.
- **Data Validation**: Utilizes Spring Boot validation for data consistency and accuracy.
- **RESTful API**: Offers a well-defined API for frontend-backend communication.

## Technologies Used

- **Backend**: Spring Boot (Java)
- **Database**: MySQL or other RDBMS supported by Spring Data JPA
- **Security**: Spring Security
- **Testing**: JUnit, Mockito
- **Others**: Lombok, Spring Data JPA, etc.

## Installation

1. Clone the repository:

    ```shell
    git clone https://github.com/yourusername/BDBank.git
    ```

2. Navigate to the project folder and install dependencies:

    ```shell
    cd BDBank
    mvn clean install
    ```

3. Start the Spring Boot backend server:

    ```shell
    mvn spring-boot:run
    ```

## Usage

- The application should now be running, with the backend available at `http://localhost:8080`.
- Use a REST client or other frontend application to interact with the backend services.

## API Documentation

The application provides a RESTful API for interacting with the backend services. You can find the API documentation at `http://localhost:8080/swagger-ui.html` once the backend server is running.

## Contributing

We welcome contributions from the community! If you would like to contribute, please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
