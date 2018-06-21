# Homebridge

This folder represents the server of a Trombinoscope allowing to create a person with his attributes like: his name, 
his favorite color, his welcome message, his email and his picture.
This server is linked to a document-oriented database MongoDB.

To run it, first, install and run MongoDB Entreprise like as shown on this link https://docs.mongodb.com/manual/tutorial/install-mongodb-enterprise-on-os-x/
In Postman (to get it https://www.getpostman.com/), you can 
  * create a new person
    url: localhost:8080/person/create
    method: POST
    body:
     {
      "id": "5b11587bc71ab80be1ea5423",
      "image": "data:image/jpeg;base64,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",
      "name": "bob smith",
      "color": [
          0,
          10,
          10
      ],
      "welcomeMsg": "hello",
      "email": "bob.smith@yahoo.fr"
     }
    
  * get list of person presented in database
    url: localhost:8080/person/list
    method: GET
    
  * modify person informations
    url: localhost:8080/person/modify
    method: POST
    body:
     {
      "id": "5b11587bc71ab80be1ea5423",
      "image": "data:image/jpeg;base64,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",
      "name": "bob laurent smith",
      "color": [
          0,
          10,
          10
      ],
      "welcomeMsg": "hello",
      "email": "bob.smith@yahoo.fr"
     }
  
  * delete a person from database 
    url: localhost:8080/person/delete/bob.smith@yahoo.fr
    method: DELETE
    
 * display a person (according to his email address)
    url: localhost:8080/person/email?email=alice.smith@serli.com
    method: GET
