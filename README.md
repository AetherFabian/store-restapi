# 1.3 Backend application development, with access to database
## Store API

#### Fabian Eduardo Escobar Galarza - TIDBIS51M - UTCH BIS - IoT Applications

## Installation
Requirements
- Java SDK 11
- Maven

```bash
> git clone https://github.com/AetherFabian/store-restapi.git
> cd store-restapi
```

## Use the app

At first, you must create a database and connect it to the project in the application.properties. 

For initialize the project, use the next command with Maven.

```bash
> mvn spring-boot:run
```

## Api Rest Service

### Tables diagram


### Endpoints
|  Routes  |   EndPoint     |  HTTP   |
| :------: | :------------: | :-----: |
| Customer |  /customer/    |  GET    |
| Store    |  /product/     |  GET    |
| Users    |  /supplier/    |  GET    |



