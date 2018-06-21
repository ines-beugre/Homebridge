package com.arthur.demo;

import com.arthur.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class HomebridgeApplication implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {

        SpringApplication.run(HomebridgeApplication.class, args);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run(String... args) throws Exception {

 //       personRepository.deleteAll();
        //        personRepository.save(new Person("bu", new int[] {0, 50, 100}, "hello", "u@yahoo.fr" ));
//        personRepository.save(new Person("ba", new int[] {0, 10, 100}, "hello", "a@yahoo.fr" ));
//        personRepository.save(new Person("be", new int[] {0, 10, 100}, "hello", "e@yahoo.fr" ));
//
//        for (Person person: personRepository.findAll()){
//            System.out.println("*****" + person.getName());
//        }

    }

}
