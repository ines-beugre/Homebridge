# Homebridge

This folder represents the server of a Trombinoscope allowing to create a person with his attributes like: his name, 
his favorite color, his welcome message, his email and his picture.
This server is linked to a document-oriented database MongoDB.

To run it, first, install and run MongoDB Entreprise like as shown on this link https://docs.mongodb.com/manual/tutorial/install-mongodb-enterprise-on-os-x/.  

In Postman (to get it https://www.getpostman.com/), you can 

  * create a new person.  
    url: localhost:8080/person/create 
    method: POST  
    body:    
     {  
      "id": "5b11587bc71ab80be1ea5423",   
      "image": "imageToBase64",   
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
    method: GET.
    
  * modify person informations  
    url: localhost:8080/person/modify  
    method: POST  
    body:  
     {  
      "id": "5b11587bc71ab80be1ea5423",  
      "image": "imageToBase64",  
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
