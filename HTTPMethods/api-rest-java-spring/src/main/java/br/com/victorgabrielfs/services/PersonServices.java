package br.com.victorgabrielfs.services;

import br.com.victorgabrielfs.models.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person create(Person person){
        logger.info("Creating person");
        return person;
    }

    public Person update(Person person){
        logger.info("Updating person");
        return person;
    }

    public void delete(String id){
        logger.info("Deleting person");
    }

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<>();
        logger.info("Finding all people");
        for (int i = 0; i < 8 ; i++){
            Person person = new Person();
            person.setId(counter.incrementAndGet());
            person.setFirstName("Victor");
            person.setLastName("Gabriel");
            person.setAddress("Aguas");
            person.setGender("Male");
            persons.add(person);
        }
        return persons;
    }
    public Person findById(String id){
        logger.info("Finding person");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Victor");
        person.setLastName("Gabriel");
        person.setAddress("Aguas");
        person.setGender("Male");
        return person;
    }
}
