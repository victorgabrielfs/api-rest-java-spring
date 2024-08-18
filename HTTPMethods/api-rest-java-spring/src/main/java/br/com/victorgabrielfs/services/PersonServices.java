package br.com.victorgabrielfs.services;

import br.com.victorgabrielfs.exceptions.ResourceNotFoundException;
import br.com.victorgabrielfs.models.Person;
import br.com.victorgabrielfs.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public Person create(Person person){
        logger.info("Creating person");
        return repository.save(person);
    }

    public Person update(Person person){
        logger.info("Updating person");
        var entity = repository.findById(person.getId())
                .orElseThrow(ResourceNotFoundException::new);
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
        return repository.save(entity);
    }

    public void delete(Long id){
        logger.info("Deleting person");
        repository.delete(repository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    public List<Person> findAll(){

        logger.info("Finding all people");

        return repository.findAll();
    }
    public Person findById(Long id){
        logger.info("Finding person");
        return repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
