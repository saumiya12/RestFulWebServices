# Restful WebServices

This project is about building Social Media Application Resource Mappings.

The main functionalities demonstrated in this project are:

User -> Posts

Retrieve all Users, Create a User, Retrieve a particular User, Delete a User

Retrieve all Posts for a User, Create a Posts for a User, Retrieve details of a post

#### Concepts Implemented:

##### `Exception handling`
@ControllerAdvice    
Creating a controller CustomizedResponseEntityExceptionHandler

##### `HATEOS`
Hypermedia As The Engine Of Application State  
Adding links to webpage. When a particular user is called -> return link for users.  
Done by using ControllerLinkBuilder

##### `Internationalization` 
Customizing application for different people around the world
Using message.properties and ResourceBundleMessageSource bean

##### `Content Negotiation`
JSON and XML formats using Jackson

##### `SWAGGER`
Documentation of API  
@Configuration and @EnableSwagger2WebMvc - on Docket bean

##### `Monitoring API`
HAL HyperText Application Language
Way to hyperlink between resources in your API

##### `Static and Dynamic Filtering`
JSONIgnore and SimpleBeanPropertyFilter

##### `Basic Authentication`

##### `JPA`
Accessing the API's by storing data using H2 database

