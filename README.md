# 1.3 Backend application development, with access to database
## Store API

#### Fabian Eduardo Escobar Galarza - TIDBIS51M - UTCH BIS - CROSS-PLATFORM MOBILE DEVELOPMENT

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

![image](https://user-images.githubusercontent.com/50721208/170808283-70db3830-d993-4add-a1ef-8ee6026713a0.png)

### Endpoints
|  Routes  |   EndPoint     |  HTTP   |
| :------: | :------------: | :-----: |
| Customer |  /customer/    |  GET    |
| Product  |  /product/     |  GET    |
| Supplier |  /supplier/    |  GET    |


![image](https://user-images.githubusercontent.com/50721208/170808145-95b2dc42-7a95-4b1c-8c1c-714c6d1a23af.png)
![image](https://user-images.githubusercontent.com/50721208/170808233-61dfb98a-362d-45df-b89e-b80bafee1642.png)
![image](https://user-images.githubusercontent.com/50721208/170808272-58c49ff4-4e38-43d4-aa8f-55438564e971.png)

