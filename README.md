# myBot
This Spring Boot application connects with OpenAI API, generates questions, and receives answers via REST operations. 
The application is connected to the MySQL database. It creates proper tables and saves generated questions and answers into them.

The main goal of this app was to establish a connection with OpenAI ChatBot, generate questions, and receive answers which were saved into the MySQL database.


## First things first
To run this application on your machine, you must provide credentials in the application.properties file, listed below:
- OpenAI API key
- OpenAI API URL
- OpenAI chatbot model
- MySQL user configuration

## Demo 

### GET Method

![image](https://github.com/Nique1/myBot/assets/84642454/f8111519-3a05-4413-9929-96b59c113b6c)

### Database 
A question table is created and a prompt from the user is inserted.

![image](https://github.com/Nique1/myBot/assets/84642454/204037e1-825d-4dc9-a152-57f26d7dda03)

An answer table is created and a prompt is inserted from the user.

![image](https://github.com/Nique1/myBot/assets/84642454/b4d9f7f6-dc3d-41fb-a824-7cb00814a4ed)

### TechStack: Java 17, Spring Boot, JUnit 5, Mockito, MySQL, Postman 
