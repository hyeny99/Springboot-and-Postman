# MEAN stack IA project: salesman management and bonus calculation
# PART2: 🗃Springboot and Test REST🗂

Introduce Spring boot and how to test REST api using Postman. </br>
Documentation with Swagger.

## Introduction
This is part of a MEAN-stack project. We will go through this step by step. </br>
In the part 1, we built a simple interface that prints the result on the console.
It was enough to test our code, but it obviously has a limit.
If a user wants to access the interface and retrieve or create/update the data, how can they gain the access from outside?
It would be impossible for the user unless they have the code. </br>
So, how can we improve this? The answer is simple! We can make a http browser using Springboot! </br>
In the part2, we will migrate the previous REST api into a Springboot REST api and test it on Postman.

## [Springboot?](https://start.spring.io/)
SpringBoot is a platform for REST based service. We will use it to provide the remote access of our appication for managing salesmen and their records to the users.
To generate the dependencies we need, go to spring initializr. (You can also click the header.)
You can take the code in pom.xml if you want to have the same dependencies.
</br>
It's really simple to map the method. Get for reading the data, Post for creating, Put for updating the existing data, and Delete for deleting the data.
I explained the annotations in the code files. 

## Code Structure
The application has three layers; Controller, Service and Repository.
<ul>
  <li> Controller: creates the base path (url) and end points for CRUD pattern. It returns the response back as success or failure. </li>
  <li> Service: layes between controller and repository. It implements the CRUD methods. </li>
  <li> Repository: has the actual CRUD functionalities. Usually it's an interface that extends MongoRepository. </li>
</ul>

## Postman
Okay, now we are all set to test our code! But How? Do we need to build an interface to test it?
But wouldn't it be a bit overkill just to test wether the code works or not?
Don't worry, we have Postman.
It allows us to test our CRUD methods with the end point (url paths) without actually having an interface. Like....
![image](https://user-images.githubusercontent.com/60022132/143301142-deec9933-5212-4dee-9fbc-e394ed7cba24.png)
this! You can test the url and the code.

## Swagger
We have tested our code and it worked! So what now?
What about documentation of the api? Do we need to document from a to z manually?
Of course no, there is a tool called Swagger.
Get a Swagger configuration and it will manage the documentation part magically.
The default path is localhost:[your port number]/swagger-ui.html
![image](https://user-images.githubusercontent.com/60022132/143302603-bdbe9c4a-c963-4698-ab64-6c5959da56e6.png)




### Related repositories
part1: [MongoDB and Java Driver](https://github.com/hyeny99/MongoDB-Java-driver)


</br>
The idea of this project is from https://github.com/aldaGit/integrationArch





